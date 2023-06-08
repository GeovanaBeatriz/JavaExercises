package com.geovanabeatriz.dscatalogBootcamp.services;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.geovanabeatriz.dscatalogBootcamp.dto.RoleDTO;
import com.geovanabeatriz.dscatalogBootcamp.dto.UserDTO;
import com.geovanabeatriz.dscatalogBootcamp.dto.UserInsertDTO;
import com.geovanabeatriz.dscatalogBootcamp.entities.Role;
import com.geovanabeatriz.dscatalogBootcamp.entities.User;
import com.geovanabeatriz.dscatalogBootcamp.repositories.RoleRepository;
import com.geovanabeatriz.dscatalogBootcamp.repositories.UserRepository;
import com.geovanabeatriz.dscatalogBootcamp.services.exceptions.DatabaseException;
import com.geovanabeatriz.dscatalogBootcamp.services.exceptions.ResourceNotFoundException;

@Service //Service realiza a lógica da aplicação
public class UserService {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepository repository;

	@Autowired
	private RoleRepository roleRepository;
	
	@Transactional(readOnly = true)
	public Page<UserDTO> findAllPaged(Pageable pageable){
		Page<User> list = repository.findAll(pageable);
		
		//Faz a mesma coisa que o bloco abaixo
		//List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
		
		/*List<UserDTO> listDto = new ArrayList<>();
		for (User cat : list) {
			listDto.add(new UserDTO(cat));
		}
		
		return listDto;
		*/
		
		return list.map(x -> new UserDTO(x));
	}

	@Transactional(readOnly = true)
	public UserDTO findById(Long id) {
		Optional<User> obj = repository.findById(id);
		User entity = obj.orElseThrow(() -> new EntityNotFoundException("Entity not found"));
		return new UserDTO(entity);
	}

	@Transactional
	public UserDTO insert(UserInsertDTO dto) {
		 User entity = new User();
		 copyDtoToEntity(dto, entity);
		 entity.setPassword(passwordEncoder.encode(dto.getPassword()));
		 entity = repository.save(entity);
		 return new UserDTO(entity);
	}
	
	@Transactional
	public UserDTO update(Long id, UserDTO dto) {
		try {
		User entity = repository.getOne(id);
		copyDtoToEntity(dto, entity);
		entity = repository.save(entity);
		return new UserDTO(entity);
		}
		catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException("id not found");
		}
	}

	public void delete(Long id) {
		try {
		repository.deleteById(id);
		}
		catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Id not found " + id); 
		}
		catch(DataIntegrityViolationException e) {
			throw new DatabaseException("Integrity violation"); 
		}
		
	
	}
	
	private void copyDtoToEntity(UserDTO dto, User entity) {
		entity.setFirstName(dto.getFirstName());
		entity.setLastName(dto.getLastName());
		entity.setEmail(dto.getEmail());
		
		
		entity.getRoles().clear();
		for(RoleDTO roleDto : dto.getRoles()) {
			Role role = roleRepository.getOne(roleDto.getId());
			entity.getRoles().add(role);
		}
	}

}

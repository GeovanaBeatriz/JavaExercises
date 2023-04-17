package com.geovanabeatriz.dscatalogBootcamp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.geovanabeatriz.dscatalogBootcamp.dto.CategoryDTO;
import com.geovanabeatriz.dscatalogBootcamp.entities.Category;
import com.geovanabeatriz.dscatalogBootcamp.repositories.CategoryRepository;

@Service //Service realiza a lógica da aplicação
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	@Transactional(readOnly = true)
	public List<CategoryDTO> findAll(){
		List<Category> list = repository.findAll();
		
		//Faz a mesma coisa que o bloco abaixo
		// List<CategoryDTO> listDto = list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
		
		List<CategoryDTO> listDto = new ArrayList<>();
		for (Category cat : list) {
			listDto.add(new CategoryDTO(cat));
		}
		
		return listDto;
	}

	@Transactional(readOnly = true)
	public CategoryDTO findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		Category entity = obj.orElseThrow(() -> new EntityNotFoundException("Entity not found"));
		return new CategoryDTO(entity);
	}

	@Transactional
	public CategoryDTO insert(CategoryDTO dto) {
		 Category entity = new Category();
		 entity.setName(dto.getName());
		 entity = repository.save(entity);
		 return new CategoryDTO(entity);
	}
}

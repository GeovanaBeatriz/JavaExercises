package com.geovanabeatriz.dscatalogBootcamp.services;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.geovanabeatriz.dscatalogBootcamp.dto.CategoryDTO;
import com.geovanabeatriz.dscatalogBootcamp.dto.ProductDTO;
import com.geovanabeatriz.dscatalogBootcamp.entities.Category;
import com.geovanabeatriz.dscatalogBootcamp.entities.Product;
import com.geovanabeatriz.dscatalogBootcamp.repositories.CategoryRepository;
import com.geovanabeatriz.dscatalogBootcamp.repositories.ProductRepository;
import com.geovanabeatriz.dscatalogBootcamp.services.exceptions.DatabaseException;
import com.geovanabeatriz.dscatalogBootcamp.services.exceptions.ResourceNotFoundException;

@Service //Service realiza a lógica da aplicação
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Transactional(readOnly = true)
	public Page<ProductDTO> findAllPaged(PageRequest pageRequest){
		Page<Product> list = repository.findAll(pageRequest);
		
		//Faz a mesma coisa que o bloco abaixo
		//List<ProductDTO> listDto = list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
		
		/*List<ProductDTO> listDto = new ArrayList<>();
		for (Product cat : list) {
			listDto.add(new ProductDTO(cat));
		}
		
		return listDto;
		*/
		
		return list.map(x -> new ProductDTO(x));
	}

	@Transactional(readOnly = true)
	public ProductDTO findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		Product entity = obj.orElseThrow(() -> new EntityNotFoundException("Entity not found"));
		return new ProductDTO(entity, entity.getCategories());
	}

	@Transactional
	public ProductDTO insert(ProductDTO dto) {
		 Product entity = new Product();
		 copyDtoToEntity(dto, entity);
		 entity = repository.save(entity);
		 return new ProductDTO(entity);
	}
	
	@Transactional
	public ProductDTO update(Long id, ProductDTO dto) {
		try {
		Product entity = repository.getOne(id);
		copyDtoToEntity(dto, entity);
		entity = repository.save(entity);
		return new ProductDTO(entity);
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
	
	private void copyDtoToEntity(ProductDTO dto, Product entity) {
		entity.setName(dto.getName());
		entity.setDescription(dto.getDescription());
		entity.setDate(dto.getDate());
		entity.setImgUrl(dto.getImgUrl());
		entity.setPrice(dto.getPrice());
		
		entity.getCategories().clear();
		for(CategoryDTO catDto : dto.getCategories()) {
			Category category = categoryRepository.getOne(catDto.getId());
			entity.getCategories().add(category);
		}
	}

}

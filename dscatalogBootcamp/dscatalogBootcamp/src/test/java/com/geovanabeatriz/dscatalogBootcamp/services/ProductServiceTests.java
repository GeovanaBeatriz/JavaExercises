package com.geovanabeatriz.dscatalogBootcamp.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.geovanabeatriz.dscatalogBootcamp.repositories.ProductRepository;

@ExtendWith(SpringExtension.class) //Teste Unitário
public class ProductServiceTests {

	@InjectMocks
	private ProductService service;
	
	@Mock //Pode tbm usar o Mockbean, mas aqui é usado o Mock pq é mais rápido e por estarmos usando o @ExtendWith
	private ProductRepository repository; //Tem que configurar o Mock para agir como o nosso repository real
	
	private Long existingId;
	private Long nonExistingId;
	
	@BeforeEach
	void setUp() throws Exception{
		
		existingId = 1L;
		nonExistingId = 1000L;
		
		Mockito.doNothing().when(repository).deleteById(existingId);//Aqui diz como o Mock vai agir
		
		Mockito.doThrow(EmptyResultDataAccessException.class).when(repository).deleteById(nonExistingId);
	}
	
	@Test
	public void deleteShouldDoNothingWhenIdExists() {
		
		Assertions.assertDoesNotThrow(() -> {
			
			service.delete(existingId);
		});
		
		Mockito.verify(repository, Mockito.times(1)).deleteById(existingId); 
	}
}

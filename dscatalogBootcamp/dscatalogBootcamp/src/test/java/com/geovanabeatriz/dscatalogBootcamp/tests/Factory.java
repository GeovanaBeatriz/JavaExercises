package com.geovanabeatriz.dscatalogBootcamp.tests;

import java.time.Instant;

import com.geovanabeatriz.dscatalogBootcamp.dto.ProductDTO;
import com.geovanabeatriz.dscatalogBootcamp.entities.Category;
import com.geovanabeatriz.dscatalogBootcamp.entities.Product;

public class Factory {

	public static Product createProduct() {
		
		Product product = new Product(1L, "Barbie doll", "Good doll", 4170.0, "https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/25-big.jpg", Instant.parse("2020-07-14T10:00:00Z"));
		product.getCategories().add(createCategory());
		return product;
	}
	
	public static ProductDTO createProductDTO() {
		Product product = createProduct();
		return new ProductDTO(product, product.getCategories());
	}
	
	public static Category createCategory() {
		return new Category(1L, "Eletrônicos");
	}
}

package com.geovanabeatriz.dscatalogBootcamp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geovanabeatriz.dscatalogBootcamp.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
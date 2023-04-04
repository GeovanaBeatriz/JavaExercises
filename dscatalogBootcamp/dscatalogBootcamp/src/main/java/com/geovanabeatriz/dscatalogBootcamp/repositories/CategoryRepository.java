package com.geovanabeatriz.dscatalogBootcamp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geovanabeatriz.dscatalogBootcamp.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}

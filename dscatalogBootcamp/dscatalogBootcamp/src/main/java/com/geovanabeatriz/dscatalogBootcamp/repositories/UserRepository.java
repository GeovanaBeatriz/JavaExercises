package com.geovanabeatriz.dscatalogBootcamp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geovanabeatriz.dscatalogBootcamp.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

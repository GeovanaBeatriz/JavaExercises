package com.geovanabeatriz.dscatalogBootcamp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geovanabeatriz.dscatalogBootcamp.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}

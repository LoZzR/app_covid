package com.covid.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.entities.ERole;
import com.covid.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}

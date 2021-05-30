package com.covid.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.covid.entities.Hopital;

public interface HopitalRepository extends JpaRepository<Hopital, Integer>{

	@Query("select h from Hopital h where u.ville = :nameHopital")
	public List<Hopital>  getHopitalByName(String nameHopital);
}

package com.covid.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.covid.entities.Hopital;

public interface HopitalRepository extends JpaRepository<Hopital, Integer>{

	@Query("select h from Hopital h where h.nomHopital = :nomHopital")
	public List<Hopital>  getHopitalByName(@Param("nomHopital")String nomHopital);
}

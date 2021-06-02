package com.covid.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.covid.entities.SejourHospitalier;

public interface SejourHospitalierRepository extends JpaRepository<SejourHospitalier, Integer>{

	@Query("SELECT s FROM SejourHospitalier s WHERE s.room.hopital.ville like %:ville%")
	public List<SejourHospitalier> getSejourByVille(@Param("ville") String ville);

	@Query("SELECT s FROM SejourHospitalier s WHERE s.room.hopital.nomHopital like %:nomHopital%")
	public List<SejourHospitalier> getSejourByNameHopital(@Param("nomHopital") String nomHopital);
	
	@Query("SELECT s FROM SejourHospitalier s WHERE s.room.hopital.nomHopital like %:nomHopital% and s.room.hopital.ville like %:ville%")
	public List<SejourHospitalier> getSejourByNameHopital(@Param("nomHopital") String nomHopital, @Param("ville") String ville);
	
}

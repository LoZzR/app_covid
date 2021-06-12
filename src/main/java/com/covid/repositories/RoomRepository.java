package com.covid.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.covid.entities.Room;

public interface RoomRepository extends JpaRepository<Room, Integer>{
	
	List<Room> findByEtat(String etat);

	@Query("select r from Room r where lower(r.hopital.nomHopital) = :nomHopital and lower(r.hopital.ville) = :ville")
	public List<Room>  findRoomByHopiatlNameAndVille(@Param("nomHopital")String nomHopital, @Param("ville")String ville);
}

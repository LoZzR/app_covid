package com.covid.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.entities.Room;

public interface RoomRepository extends JpaRepository<Room, Integer>{

}

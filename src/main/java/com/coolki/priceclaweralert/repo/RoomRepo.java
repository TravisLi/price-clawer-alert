package com.coolki.priceclaweralert.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.coolki.priceclaweralert.data.Room;

@Repository
public interface RoomRepo extends CrudRepository<Room, Long>{
	
	@Query("SELECT r FROM Room r WHERE r.roomName = :name")
	List<Room> findRoomByName(@Param("name")String name);
	
}

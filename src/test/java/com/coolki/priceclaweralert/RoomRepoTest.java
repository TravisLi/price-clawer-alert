package com.coolki.priceclaweralert;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.coolki.priceclaweralert.data.Room;
import com.coolki.priceclaweralert.repo.RoomRepo;

@SpringBootTest
public class RoomRepoTest {

	@Autowired
	private RoomRepo roomRepo;
	
	@Test
	@DisplayName("Get Room from Database")
	public void getAllRoomTest() {
		
		List<Room> result = new ArrayList<Room>();
		roomRepo.findAll().forEach(result::add);
		assertTrue(result.size()>0);
	}
	
	@Test
	@DisplayName("Get Room by Name")
	public void getRoomByNameTest() {
		
		List<Room> result = roomRepo.findRoomByName("Oxford");
		assertTrue(result.size()>0);
		
	}
	
}

package com.coolki.priceclaweralert.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coolki.priceclaweralert.data.Room;
import com.coolki.priceclaweralert.repo.RoomRepo;

@Service
public class RoomService {

	private final RoomRepo roomRepo;
	
	@Autowired
	public RoomService(RoomRepo roomRepo) {
		this.roomRepo = roomRepo;
	}
	
	public List<Room> getRooms(){
		Iterator<Room>it = roomRepo.findAll().iterator();
		List<Room> result = new ArrayList<Room>();
		it.forEachRemaining(result::add);
		return result;
	}
	
	public List<Room>getRoomByName(String name) {
		return this.roomRepo.findRoomByName(name);
	}
	
}

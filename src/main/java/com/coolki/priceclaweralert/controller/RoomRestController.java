package com.coolki.priceclaweralert.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coolki.priceclaweralert.data.Room;
import com.coolki.priceclaweralert.service.RoomService;

@RestController
@RequestMapping("api/reservations")
public class RoomRestController {

	private RoomService roomService;

	@Autowired
	public RoomRestController(RoomService roomService) {
		this.roomService = roomService;
	}

	@GetMapping("/Rooms")
	public List<Room> getRooms(){
		return this.roomService.getRooms();
	}
	
	@GetMapping
	public List<Room> getRoomByName(@RequestParam(name="name")String name){
		return this.roomService.getRoomByName(name);
	}
	
	
}

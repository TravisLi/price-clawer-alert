package com.coolki.priceclaweralert;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.coolki.priceclaweralert.repo.RoomRepo;
import com.coolki.priceclaweralert.service.RoomService;

@ExtendWith(MockitoExtension.class)
public class RoomServiceTest {

	@Mock
	private RoomRepo roomRepo;
	@InjectMocks
	private RoomService roomService;
	
	@BeforeEach
	public void init() {
		

								
	}
	
	@Test
	@DisplayName("Room Serivce getRooms Test")
	public void getRoomsTest() {
		
		roomService.getRooms();
		
		verify(roomRepo).findAll();
		
	}
	
	
	
}

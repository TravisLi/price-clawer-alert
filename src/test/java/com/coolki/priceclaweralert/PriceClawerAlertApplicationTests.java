package com.coolki.priceclaweralert;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.coolki.priceclaweralert.controller.RoomRestController;
import com.coolki.priceclaweralert.service.RoomService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(RoomRestController.class)
class PriceClawerAlertApplicationTests {

	@MockBean
	private RoomService roomService;
	
	@Autowired
	private MockMvc mockMVC;
	
	@Test
	public void getRoomWithName() {
		String name = "Oxford";
	}
}

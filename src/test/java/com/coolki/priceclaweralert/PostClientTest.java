package com.coolki.priceclaweralert;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;

import java.time.Duration;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;

import com.coolki.priceclaweralert.postman.PostmanClient;
import com.coolki.priceclaweralert.repo.RoomRepo;

import feign.Feign;

//@SpringBootTest
public class PostClientTest {

	private static final String POSTMAN_ENDPOINT = "https://postman-echo.com/";
	
	@Mock
	private RoomRepo repo;
	
	@Test
	@DisplayName("getReguestGet")
	public void postClientTest() {
		
		PostmanClient pc = Feign.builder()
				.target(PostmanClient.class, POSTMAN_ENDPOINT);
		
		String result = pc.postmanEcho();
		System.out.println(result);
		
		assumeTrue(result==null);
		
		assertTrue(result.contains("args"));
		
		assertTimeout(Duration.ofNanos(1), ()->pc.postmanEcho(), "too long for execution");
		
		verify(repo).deleteById(anyLong());
		
		ArgumentCaptor<Boolean> c = ArgumentCaptor.forClass(Boolean.class);
	}
	
		
}

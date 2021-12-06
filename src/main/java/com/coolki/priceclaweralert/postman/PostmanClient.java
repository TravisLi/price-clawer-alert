package com.coolki.priceclaweralert.postman;

import feign.Headers;
import feign.RequestLine;

public interface PostmanClient {

	@RequestLine("GET /get")
	@Headers("Content-TYpe: application/json")
	public String postmanEcho();
	
}

package com.app.simple.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SimpleControllerTest {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	public void givenHelloWithName_whenCallGetHello_thenReturnHelloWithName() {
		webTestClient.get().uri("/hello/Simple").accept(MediaType.TEXT_PLAIN).exchange().expectStatus().isOk()
				.expectBody(String.class).isEqualTo("Hello Simple.");
	}

}

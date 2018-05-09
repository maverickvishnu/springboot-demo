package com.zerototech;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class ,webEnvironment= SpringBootTest.WebEnvironment.DEFINED_PORT)

public class PromoControllerWebWebIntegrationTesting {
	
	public void testFindALl() throws JsonProcessingException, IOException {
		   TestRestTemplate template = new TestRestTemplate();
		   ResponseEntity<String> response = template.getForEntity("http://localhost:8181/promo/get", String.class);
		   assertThat(response.getStatusCode() ,equalTo(HttpStatus.OK));
		   ObjectMapper mapper = new ObjectMapper();
		   JsonNode responseJson = mapper.readTree(response.getBody());
		   assertThat(responseJson.isMissingNode() ,is(false));
		   assertThat(responseJson.toString() ,equalTo("[]"));
		   
		   
	}
   
   
}

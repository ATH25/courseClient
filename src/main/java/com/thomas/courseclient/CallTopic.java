package com.thomas.courseclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.thomas.courseclient.model.Topic;

@Component
public class CallTopic implements CommandLineRunner{
	private static final Logger logger = LoggerFactory
			.getLogger(CallTopic.class);
	
	public static void callTopic(){
		RestTemplate restTemplate = new RestTemplate();
		Topic topic = restTemplate.getForObject("http://localhost:8080/topics/1", Topic.class);
		logger.debug("--- topic description returned to CallTopic is: " + topic.getDescription());
		
	}

	@Override
	public void run(String... arg0) throws Exception {
		callTopic();
		
	}

}

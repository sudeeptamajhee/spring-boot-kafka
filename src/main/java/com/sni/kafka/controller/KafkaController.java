package com.sni.kafka.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sni.kafka.service.Producer;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
	
	private static final Logger logger = LoggerFactory.getLogger(KafkaController.class);

	@Autowired
	private Producer producer;

	@GetMapping("/producer")
	public String producer(@RequestParam("message") String message) {
		producer.send(message);
		logger.debug(message + ", Message sent to the Kafka Topic K_TOPIC Successfully");
		return "Message sent to the Kafka Topic K_TOPIC Successfully";
	}

}

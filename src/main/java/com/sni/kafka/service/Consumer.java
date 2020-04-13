package com.sni.kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

	@KafkaListener(topics = "${app.kafka.topic}")
	public void consume(@Payload String message, @Headers MessageHeaders headers) {
		logger.debug("#### Received message = '{}' ", message);
		headers.keySet().forEach(key -> logger.debug("#### {}: {}", key, headers.get(key)));
	}
}

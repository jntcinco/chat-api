package com.jcinco.chat.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatContoller {

//    private final KafkaProducerService producerService;
//
//    @Autowired
//    public ChatContoller(KafkaProducerService producerService) {
//        this.producerService = producerService;
//    }
//
//    @PostMapping("/publish")
//    public ResponseEntity<String> publishMessage(@RequestParam("message") String message) {
//        producerService.sendMessage("my-topic", message);
//        return ResponseEntity.ok("Message published to Kafka topic");
//    }
	
	@RequestMapping("/")
	public String home() {
		return "Hello Docker World";
	}
}

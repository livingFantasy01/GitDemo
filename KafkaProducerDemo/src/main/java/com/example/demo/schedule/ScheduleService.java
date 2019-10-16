package com.example.demo.schedule;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.demo.service.ProducerService;

@Component
public class ScheduleService {
	
	@Autowired
	private ProducerService producerService;

	@Scheduled(fixedDelay = 1000)
	public void scheduleFixedDelayTask() {
		System.out.println("Scheduler service is started. !!");
		String message = "current time is " + new Date();
		producerService.sendMessage(message);
		System.out.println("Message Sent. !!");

	}
}

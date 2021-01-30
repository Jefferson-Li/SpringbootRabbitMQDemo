package com.rabbitmq.demo.rabbit;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	// 發送消息
	public void send(String msg) {
		System.out.println("Sender:" + msg);
		this.rabbitTemplate.convertAndSend("Jefferson", msg);
	}

}

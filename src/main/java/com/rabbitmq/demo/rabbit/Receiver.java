package com.rabbitmq.demo.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "Jefferson")
public class Receiver {

	// 接收到消息的處理方法
	@RabbitHandler
	public void process(String message) {
		System.out.println("Receiver" + message);
	}

}

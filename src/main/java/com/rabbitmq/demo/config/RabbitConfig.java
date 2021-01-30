package com.rabbitmq.demo.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

	// 建立一個隊列名稱為Jefferson
	@Bean
	public Queue jQueue() {
		return new Queue("Jefferson");
	}

}

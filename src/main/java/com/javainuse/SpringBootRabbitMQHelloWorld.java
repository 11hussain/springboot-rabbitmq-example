//package com.javatechie.rabbitmq.demo;
package com.javainuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRabbitMQHelloWorld {


		//SpringApplication.run(SpringBootRabbitMQHelloWorld.class, args);
		// rabbitmq-plugins enable rabbitmq_management
		// https://docs.github.com/en/authentication/connecting-to-github-with-ssh/adding-a-new-ssh-key-to-your-github-account
	//	C:\Program Files\RabbitMQ Server\rabbitmq_server-3.8.8\sbin>rabbitmq-service.bat start
	//	michaellihs
	//	/
	//	spring-rabbitmq
		
		//mechero
		// /
	//	spring-boot-amqp-messaging
		public static void main(String[] args) {

System.out.println("child  from from master"); 


			SpringApplication.run(
					new Object[] { SpringBootRabbitMQHelloWorld.class }, args);
		}

	}



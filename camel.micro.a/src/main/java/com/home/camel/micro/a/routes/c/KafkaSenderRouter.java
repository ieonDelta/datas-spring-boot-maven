package com.home.camel.micro.a.routes.c;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class KafkaSenderRouter extends RouteBuilder{
	
	@Override
	public void configure() throws Exception {
		
		from("file:files/json")
		.log("${body}")
		.to("kafka:my-topico-kafka");
	}
}

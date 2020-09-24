package com.verizontraining.shoppingcartapigatewayzuulserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ShoppingCartApiGatewayZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartApiGatewayZuulServerApplication.class, args);
	}

	@Bean
	public Sampler getSampler() {
	   return Sampler.NEVER_SAMPLE;	
	}
}

package com.vishnu.edgeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.vishnu.edgeservice.filters.ErrorFilter;
import com.vishnu.edgeservice.filters.PostFilter;
import com.vishnu.edgeservice.filters.PreFilter;
import com.vishnu.edgeservice.filters.RouteFilter;

@EnableDiscoveryClient  //To available for eureka service to find application
@EnableZuulProxy  // To act as api-gateway or edge server
@SpringBootApplication
public class EdgeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdgeServiceApplication.class, args);
	}
	
	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
	
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	
}

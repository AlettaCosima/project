package com.chentao.echi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 
 * @author chentao
 * RefreshScope 不重启服务刷新远程配置
 * EnableEurekaClient 注册中心客户端
 * EnableHystrixDashboard 断路器控制页面
 * EnableCircuitBreaker 断路器
 */

@RefreshScope
@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
@EnableCircuitBreaker
public class EchiApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(EchiApplication.class, args);
	}
}
 

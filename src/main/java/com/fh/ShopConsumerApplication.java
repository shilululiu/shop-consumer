package com.fh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class ShopConsumerApplication {

	/**
	 * @Author 石潞潞
	 * @Description //TODO
	 * @Date 16:50 2018/10/16
	 * @Param [args]
	 * @return void
	 **/
	public static void main(String[] args) {
		SpringApplication.run(ShopConsumerApplication.class, args);
	}
}

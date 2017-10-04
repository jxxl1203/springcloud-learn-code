package pers.ray;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 只需要通过添加这个注解让springboot帮你自动启动为注册中心
public class RegisterApp {

	public static void main(String[] args) {
		SpringApplication.run(RegisterApp.class, args);
	}

}

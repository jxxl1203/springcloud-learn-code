package pers.ray;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigClientApp.class).web(true).run(args);
    }
}
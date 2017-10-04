package pers.ray.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {

    @Value("${info.title}")
    private String title;
    @Value("${info.type}")
    private String type;

    @GetMapping("/title")
    public String getTitle(){
        return title;
    }
    @GetMapping("/type")
    public String getType(){
    	return type;
    }
}
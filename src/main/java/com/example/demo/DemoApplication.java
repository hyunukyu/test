package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
@EnableScheduling
@Component
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@RequestMapping("/hello") ////
	public String getMethod() { 
		return "hello!!!!!"; 
	}

    // 매일 5시 30분 0초에 실행한다.
    @Scheduled(cron = "0 10 14 * * *")
    public void aJob() {
    	System.out.println("0 10 14 * * *");
        // 실행될 로직
    }
    
	// 애플리케이션 시작 후 60초 후에 첫 실행, 그 후 매 10초마다 주기적으로 실행한다.
    @Scheduled(initialDelay = 60000, fixedDelay = 10000)
    public void otherJob() {
    	System.out.println("~!~!~!~!~!~!~!~!~!~!~!~!~!~!~!~!~!~!");
        // 실행될 로직
    }
}

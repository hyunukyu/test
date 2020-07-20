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

    // ���� 5�� 30�� 0�ʿ� �����Ѵ�.
    @Scheduled(cron = "0 10 14 * * *")
    public void aJob() {
    	System.out.println("0 10 14 * * *");
        // ����� ����
    }
    
	// ���ø����̼� ���� �� 60�� �Ŀ� ù ����, �� �� �� 10�ʸ��� �ֱ������� �����Ѵ�.
    @Scheduled(initialDelay = 60000, fixedDelay = 10000)
    public void otherJob() {
    	System.out.println("~!~!~!~!~!~!~!~!~!~!~!~!~!~!~!~!~!~!");
        // ����� ����
    }
}

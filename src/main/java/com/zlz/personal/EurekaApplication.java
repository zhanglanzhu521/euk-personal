package com.zlz.personal;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@EnableEurekaServer
@RestController
public class EurekaApplication {
    public static void main(String[] args) {
//        SpringApplication.run(A_EurekaApplication.class, args);

        SpringApplication springApplication = new SpringApplication(EurekaApplication.class);

        //添加自己初始化的实例

        ConfigurableApplicationContext configurableApplicationContext = springApplication.run(args);
    }



	@PostMapping("/test")
	public String hello() {
//        int i= 10/0;//测试全局异常处理
		return "ssss";
	}

}

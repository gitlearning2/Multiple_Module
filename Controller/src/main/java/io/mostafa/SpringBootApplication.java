package io.mostafa;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
@org.springframework.boot.autoconfigure.SpringBootApplication
@ComponentScan("io.mostafa")
public class SpringBootApplication {
public static void main(String[] args) {
	//Hello my name is mostafa mahmoud farag 
	SpringApplication.run(SpringBootApplication.class, args);
}
	
}

package me.coffeemori;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@SpringBootConfiguration
//@ComponentScan
//@EnableAutoConfiguration
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) // SpringBootConfiguration + ComponentScan + EnableAutoConfiguration
public class App {
	public static void main(String[] args) {
		/* 스프링 web설정 해제
		SpringApplication application = new SpringApplication(App.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);*/
		SpringApplication.run(App.class, args);
	}
//	@Bean
//	public Holoman holoman() {
//		Holoman holoman = new Holoman();
//		holoman.setName("coffeemori");
//		holoman.setHowLong(60);
//		return holoman;
//	}
}

package com.hcl;
//http://java.candidjava.com/tutorial/spring-custom-validator-example-with-Validator-interface.htm
//http://www.bogotobogo.com/Java/tutorials/Spring-Boot/Spring-Boot-HelloWorld-with-Maven.php(deploy as jar)
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
 
@SpringBootApplication
public class Application{
     
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
 
 
}
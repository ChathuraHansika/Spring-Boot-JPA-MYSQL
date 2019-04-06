/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author Chathura
 */
@EntityScan("com.mycompany.user")
@SpringBootApplication
@ComponentScan("com.mycompany")
@EnableJpaRepositories("com.mycompany")
public class NewClass {
    public static void main(String[] args) {
        SpringApplication.run(NewClass.class, args);
    }
    
    
}

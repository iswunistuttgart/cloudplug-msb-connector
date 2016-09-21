package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Timur Tasci
 * @version 1.0
 * @date 07.09.2016
 * @copyright Timur Tasci, ISW Uni Stuttgart
 */
@SpringBootApplication
@ComponentScan(basePackages = "rest")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

package ex02;

import java.util.Map;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import ex02.runner.HelloWorldRunner;

@SpringBootApplication
public class ExApplication {
    public static void main(String[] args) {
        try (
            ConfigurableApplicationContext applicationContext = SpringApplication.run(
                ExApplication.class, args
            );
        ) {
        }
    }

    @Bean
    public Map<?, ?> myMap() {
        return Map.of(
            "greetings", "Hello, World!"
        );
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return new HelloWorldRunner(myMap());
    }
}

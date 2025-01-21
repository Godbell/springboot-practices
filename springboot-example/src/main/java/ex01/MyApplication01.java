package ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
@SpringBootConfiguration
public class MyApplication01 {
    public static void main(String[] args) {
        try (
            ConfigurableApplicationContext applicationContext = SpringApplication.run(
                MyApplication01.class, args
            );
        ) {
        }
    }

    @Bean
    public MyComponent myComponent01() {
        return new MyComponent();
    }
}

package webmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class WebMvcApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebMvcApplication.class, args);
    }

    @Controller
    public static class MvcController {
        @ResponseBody
        @GetMapping("/hello")
        public String hello() {
            return "Hello, World!!!";
        }

        @GetMapping("/hello2")
        public String hello2() {
            return "th/hello";
        }

        @GetMapping("/hello3")
        public String hello3() {
            return "/hello";
        }
    }
}

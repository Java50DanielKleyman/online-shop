package onlinestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class OnlinestoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(OnlinestoreApplication.class, args);
    }

    @GetMapping("/")
    @ResponseBody
    public String helloWorld() {
        return "Hello, world!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
    }
}
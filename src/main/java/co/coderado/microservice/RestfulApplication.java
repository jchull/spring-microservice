package co.coderado.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestfulApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestfulApplication.class, args);
    }

    @RequestMapping("/")
    public String welcome() {
        return "Welcome!";
    }


}

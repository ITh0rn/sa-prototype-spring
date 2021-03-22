package it.univaq.softwarearchitecture.prototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PrototypeApplication {

    @GetMapping("/")
    public String start() {
        return "Servizio T1 v2";
    }

    @GetMapping("/test")
    public String test() {
        return "Worker in esecuzione";
    }

    public static void main(String[] args) {
        SpringApplication.run(PrototypeApplication.class, args);
    }

}

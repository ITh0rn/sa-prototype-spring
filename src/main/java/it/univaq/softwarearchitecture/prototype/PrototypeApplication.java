package it.univaq.softwarearchitecture.prototype;

import it.univaq.softwarearchitecture.prototype.model.Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@SpringBootApplication
@RestController
public class PrototypeApplication {

    @GetMapping("/")
    public Service start() {
        return new Service(new Date(), Service.Type.T1.toString(), "Running");
    }

    @GetMapping("/test")
    public String test() {
        return "Worker in esecuzione";
    }

    public static void main(String[] args) {
        SpringApplication.run(PrototypeApplication.class, args);
    }

}

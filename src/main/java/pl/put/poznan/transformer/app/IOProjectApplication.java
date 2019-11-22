package pl.put.poznan.transformer.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"pl.put.poznan.transformer.app"})
public class IOProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(IOProjectApplication.class, args);
    }

}

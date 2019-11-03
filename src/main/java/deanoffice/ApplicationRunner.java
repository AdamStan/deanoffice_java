package deanoffice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationRunner {
    /**
     * Starts program
     * 
     * @param args parameters on start, doesn't matter in this application
     */
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunner.class, args);
    }
}

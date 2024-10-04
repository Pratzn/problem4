package technology.pratz.problem4;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Problem4Application {

    public static void main(String[] args) {
        SpringApplication.run(Problem4Application.class, args);
    }


    @Bean
    public CommandLineRunner runner(){
        return (args)->{



        };
    }
}

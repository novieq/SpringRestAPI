package consumingrest;

import hello.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class ConsumingRest {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

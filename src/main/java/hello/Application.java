package hello;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import consumingrest.Page;

@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
    //    SpringApplication.run(Application.class, args);
            RestTemplate restTemplate = new RestTemplate();
            Page page = restTemplate.getForObject("http://graph.facebook.com/pivotalsoftware", Page.class);
            System.out.println("Name:    " + page.getName());
            System.out.println("About:   " + page.getAbout());
            System.out.println("Phone:   " + page.getPhone());
            System.out.println("Website: " + page.getWebsite());

    }
}

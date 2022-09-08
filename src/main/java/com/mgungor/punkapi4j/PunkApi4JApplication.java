package com.mgungor.punkapi4j;

import com.mgungor.punkapi4j.Model.Beer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import static com.mgungor.punkapi4j.Utils.Url.GET_BEERS_WITH_PAGE;

@SpringBootApplication
public class PunkApi4JApplication {

    public static void main(String[] args) {
        SpringApplication.run(PunkApi4JApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
    /*
    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Beer[] beer = restTemplate.getForObject(GET_BEERS_WITH_PAGE(), Beer[].class);
        };
    }
    */

}

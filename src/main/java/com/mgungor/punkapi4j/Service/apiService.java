package com.mgungor.punkapi4j.Service;

import com.mgungor.punkapi4j.Model.Beer;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

import static com.mgungor.punkapi4j.Utils.Url.*;

@Service
public class apiService {

    private final RestTemplate restTemplate;

    public apiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String test(){
        return  "OK";
    }

    public Beer[] getBeer(Integer id){
        return restTemplate.getForObject(GET_BEER(id), Beer[].class);
    }

    public Beer[] getBeers(){
        return restTemplate.getForObject(GET_BEERS, Beer[].class);
    }

    public Beer[] getRandomBeer(){
        return restTemplate.getForObject(GET_RANDOM_BEER, Beer[].class);
    }

    public Beer[] beersWithPage(Integer page, Integer per_page){
        return restTemplate.getForObject(GET_BEERS_WITH_PAGE(page,per_page), Beer[].class);
    }

    public Beer[] getSpecifiedBeer(HttpServletRequest queryParameters){
        return restTemplate.getForObject(GET_QUERY(queryParameters), Beer[].class);
    }
}

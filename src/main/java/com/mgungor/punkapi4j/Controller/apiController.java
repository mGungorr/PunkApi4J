package com.mgungor.punkapi4j.Controller;

import com.mgungor.punkapi4j.Model.Beer;
import com.mgungor.punkapi4j.Service.apiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

import static com.mgungor.punkapi4j.Utils.Endpoint.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("v2")
public class apiController {
    private final apiService apiService;

    @GetMapping (value = TEST)
    public @ResponseBody String test() {
        return apiService.test();
    }

    @GetMapping(value = BEER)
    public @ResponseBody Beer[] getBeer(@PathVariable Integer id) {
        return apiService.getBeer(id);
    }

    @GetMapping(value = BEERS)
    public @ResponseBody Beer[] getBeers() {
        return apiService.getBeers();
    }

    @GetMapping(value = RANDOM_BEER)
    public @ResponseBody Beer[] getRandomBeer() {
        return apiService.getRandomBeer();
    }

    @GetMapping(value = BEERS_WITH_PAGE)
    public @ResponseBody Beer[] beersWithPage(@RequestParam int page, @RequestParam int per_page) {
        return apiService.beersWithPage(page,per_page);
    }

    @GetMapping(value = QUERY)
    public @ResponseBody Beer[] getSpecifiedBeer(HttpServletRequest queryParameters) {
        return apiService.getSpecifiedBeer(queryParameters);
    }

}

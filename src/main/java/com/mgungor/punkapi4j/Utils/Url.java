package com.mgungor.punkapi4j.Utils;

import javax.servlet.http.HttpServletRequest;

public class Url {
    public static final String ROOT ="https://api.punkapi.com/v2/";
    public static final String GET_BEERS = ROOT + "beers";

    public static final String GET_RANDOM_BEER = GET_BEERS + "/random";

    public static String GET_BEER(Integer id){
        return GET_BEERS + "/" + id;
    }
    public static String GET_BEERS_WITH_PAGE(Integer page, Integer per_page){
        return GET_BEERS + "?page=" +page+ "&per_page="+per_page;
    }

    public static String GET_QUERY(HttpServletRequest queryParameters){
        return GET_BEERS + "?"+ queryParameters.getQueryString();
    }
}

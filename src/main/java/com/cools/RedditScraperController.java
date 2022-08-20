package com.cools;

import io.micronaut.http.annotation.*;

@Controller("/redditScraper")
public class RedditScraperController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}
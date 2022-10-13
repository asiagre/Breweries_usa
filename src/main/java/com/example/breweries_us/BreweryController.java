package com.example.breweries_us;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/api/v1/breweries")
@AllArgsConstructor
public class BreweryController {

    private BreweryService breweryService;

    @RequestMapping("/import")
    @ResponseStatus(HttpStatus.OK)
    public void importBreweries() {
        breweryService.importBreweries();
    }

    @RequestMapping("/print")
    @ResponseStatus(HttpStatus.OK)
    public void printInformation() {
        breweryService.printInformation();
    }
}

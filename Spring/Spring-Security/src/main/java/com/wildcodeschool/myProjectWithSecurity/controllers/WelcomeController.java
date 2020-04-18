package com.wildcodeschool.myProjectWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String admin() {
        return "Avengers...Assemble";
    }

    @GetMapping("/secret-bases")
    public List<String> director() {

        List<String> cities = new ArrayList<>();
        cities.add("Biarritz");
        cities.add("Bordeaux");
        cities.add("La Loupe");
        cities.add("Lille");
        cities.add("Lyon");
        cities.add("Marseille");
        cities.add("Nantes");
        cities.add("Orléans");
        cities.add("Paris");
        cities.add("Reims");
        cities.add("Strasbourg");
        cities.add("Toulouse");
        cities.add("Tours");
        cities.add("Amsterdam");
        cities.add("Barcelone");
        cities.add("Berlin");
        cities.add("Bruxelles");
        cities.add("Bucarest");
        cities.add("Bucarest");
        cities.add("Budapest");
        cities.add("Dublin");
        cities.add("Lisbonne");
        cities.add("Londres");
        cities.add("Madrid");
        cities.add("Milan");

        return cities;
    }
}

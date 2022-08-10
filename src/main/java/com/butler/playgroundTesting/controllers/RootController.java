package com.butler.playgroundTesting.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RootController {

    @GetMapping("/data")
    private String getData(@RequestParam String typeOfData) {
        return "Your GET request here. You requested " + typeOfData + " data.";
    }

    @DeleteMapping("/data")
    private String deleteData() {
        return "Your DELETE request here";
    }

    @PutMapping("/data")
    private String putData() {
        return "Your PUT request here.";
    }

    @PostMapping("/data")
    private String postData() {
        return "Your POST request here.";
    }

    @PostMapping("/data/{pathVar}")
    private String postDataPathVar(@PathVariable String pathVar) {
        return "Your path variable:" + pathVar;
    }
}


//          While trying to break:
// & and ? are triggers for PathVars and QueryParams, will break the string in URL but still functional
// Spaces will still work with PathVar and be read correctly, looks like browser will add %20 to identify them
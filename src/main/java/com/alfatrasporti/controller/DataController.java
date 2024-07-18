package com.alfatrasporti.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class DataController {

    @GetMapping("/api/data")
    public List<String> getData() {
        return Arrays.asList("Dato 1", "Dato 2", "Dato 3", "ciao vale guarda come ti configuro da back a front");
    }


}


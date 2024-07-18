package com.alfatrasporti.controller;


import com.alfatrasporti.model.Fermata;
import com.alfatrasporti.repository.FermateRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/fermate")
public class FermateController {


    @GetMapping( value = "selezionatuttefermate") //l'indirizzo web dove collegarsi con postman per fare test
    public static List<Fermata> selezionatuttefermate(){

        System.out.println("buongiorno mondo");
        System.out.println(FermateRepository.selezionaTutteFermate());
        return FermateRepository.selezionaTutteFermate();
    }

}

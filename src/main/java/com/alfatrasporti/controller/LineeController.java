package com.alfatrasporti.controller;


import com.alfatrasporti.model.Fermata;
import com.alfatrasporti.model.Linee;
import com.alfatrasporti.model.LineeView;
import com.alfatrasporti.repository.FermateRepository;
import com.alfatrasporti.repository.LineeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/linee")
public class LineeController {




    @GetMapping( value = "dammiInfoLinee") //l'indirizzo web dove collegarsi con postman per fare test
    public static ArrayList<LineeView> dammiInfoLinee(){

        ArrayList<LineeView> returnList = new ArrayList<LineeView>();
        List<Linee> array =LineeRepository.selezionaTutteLinee();
        System.out.println(array);
        for (Linee elemento : array) {
            // Codice da eseguire per ogni elemento
            LineeView lw = new LineeView(elemento.getIdLinea(), elemento.getNomeLinea(), "pippo franco srl", 123.85 );
            returnList.add(lw);
        }
        return  returnList;
    }

}

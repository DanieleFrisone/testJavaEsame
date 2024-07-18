package com.alfatrasporti.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fermata implements Serializable {

    private int idFermata;
    private String nomeFermata;
    private String tipoFermata;
    private String zonaFermata;

}

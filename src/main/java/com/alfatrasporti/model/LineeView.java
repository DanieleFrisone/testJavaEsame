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
public class LineeView implements Serializable {

    private int idLinea;
    private String nomeLinea;
    private String nomeAzienda;
    private Double prezzoPreventivo;

}

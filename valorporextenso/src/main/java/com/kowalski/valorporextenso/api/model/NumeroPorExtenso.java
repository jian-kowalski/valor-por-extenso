package com.kowalski.valorporextenso.api.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NumeroPorExtenso {

    private String valorConvertido;

    public NumeroPorExtenso(String valorConvertido) {
        this.valorConvertido = valorConvertido;
    }
    
}

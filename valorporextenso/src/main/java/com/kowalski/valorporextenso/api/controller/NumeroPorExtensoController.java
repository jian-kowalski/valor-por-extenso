package com.kowalski.valorporextenso.api.controller;

import com.kowalski.valorporextenso.api.model.NumeroPorExtenso;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/valores")
public class NumeroPorExtensoController {
    
    @GetMapping("/numeral/{valorConversao}")
    public NumeroPorExtenso converterNumeral(@PathVariable Long valorConversao) {
        return new NumeroPorExtenso(valorConversao.toString());
    }
}

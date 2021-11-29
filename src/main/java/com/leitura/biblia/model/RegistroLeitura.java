package com.leitura.biblia.model;

import lombok.Getter;

import java.util.List;

@Getter
public class RegistroLeitura {

    private String nomeLivro;
    private List<CapituloLido> capitulosLidos;

    public RegistroLeitura(String nomeLivro, List<CapituloLido> capitulosLidos){
        this.nomeLivro = nomeLivro;
        this.capitulosLidos = capitulosLidos;
    }
}

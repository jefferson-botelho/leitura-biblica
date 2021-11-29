package com.leitura.biblia.model;

import lombok.Getter;

@Getter
public class CapituloLido {

    private int numCapitulo;
    private boolean lido;

    public CapituloLido(int numCapitulo, boolean lido){
        this.numCapitulo = numCapitulo;
        this.lido = lido;
    }
}
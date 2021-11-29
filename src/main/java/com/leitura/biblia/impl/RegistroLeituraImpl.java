package com.leitura.biblia.impl;

import com.leitura.biblia.model.Antigo;
import com.leitura.biblia.model.CapituloLido;
import com.leitura.biblia.model.Novo;
import com.leitura.biblia.model.RegistroLeitura;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RegistroLeituraImpl {

    public List<RegistroLeitura> gerarAntigoTestamento(){
        List<Antigo> lista = Arrays.asList(Antigo.values());
        List<RegistroLeitura> registro = new ArrayList<>();

        for(Antigo livro : lista){
            List<CapituloLido> capitulosLidos = new ArrayList<>();
            for(int i = 1; i<=livro.getCapitulos(); i++){
                CapituloLido capituloLido = new CapituloLido(i, false);
                capitulosLidos.add(capituloLido);
            }
            registro.add(new RegistroLeitura(livro.getNomeLivro(), capitulosLidos));
        }

        return registro;
    }

    public List<RegistroLeitura> gerarNovoTestamento(){
        List<Novo> lista = Arrays.asList(Novo.values());
        List<RegistroLeitura> registro = new ArrayList<>();

        for(Novo livro : lista){
            List<CapituloLido> capitulosLidos = new ArrayList<>();
            for(int i = 1; i<=livro.getCapitulos(); i++){
                CapituloLido capituloLido = new CapituloLido(i, false);
                capitulosLidos.add(capituloLido);
            }
            registro.add(new RegistroLeitura(livro.getNomeLivro(), capitulosLidos));
        }
        return registro;
    }
}
package com.leitura.biblia.impl;

import com.leitura.biblia.model.RegistroLeitura;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Getter
@Data
@NoArgsConstructor
@Document("livros")
public class GerarLivrosDTO {

    @Id
    private String id;
    private List<RegistroLeitura> antigoTestamento;
    private List<RegistroLeitura> novoTestamento;

    public GerarLivrosDTO (List<RegistroLeitura> antigoTestamento,
                           List<RegistroLeitura> novoTestamento){
        this.antigoTestamento = antigoTestamento;
        this.novoTestamento = novoTestamento;
    }

    public GerarLivrosDTO gerarLivrosBiblia(){
        RegistroLeituraImpl registroLeitura = new RegistroLeituraImpl();
        GerarLivrosDTO gerarLivros =
                new GerarLivrosDTO(registroLeitura.gerarAntigoTestamento(),
                        registroLeitura.gerarNovoTestamento());
        return gerarLivros;
    }
}

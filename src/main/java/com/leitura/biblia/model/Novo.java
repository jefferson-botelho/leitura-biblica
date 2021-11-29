package com.leitura.biblia.model;

import lombok.Getter;

@Getter
public enum Novo {

    MATEUS("Mateus", 28), MARCOS("Marcos", 16), LUCAS("Lucas", 24),
    JOAO("João", 21), ATOS("Atos", 28), ROMANOS("Romanos", 16),
    CORINTIOS1("1 Coríntios", 16), CORINTIOS2("2 Coríntios", 13), GÁLATAS("Gálatas", 6),
    EFESIOS("Efésios", 6), FILIPENSES("Filipenses", 4), COLOSSENSES("Colossenses", 4),
    TESSALONICENSES1("1 Tessalonicences", 5), TESSALONICENSES2("2 Tessalonicences", 3),
    TIMOTEO1("1 Timóteo", 6), TIMOTEO2("2 Timóteo", 4), TITO("Tito", 3),
    FILEMON("Filemon", 1), HEBREUS("Hebreus", 13), TIAGO("Tiago", 5), PEDRO1("1 Pedro", 5),
    PEDRO2("2 Pedro", 3), JOAO1("1 João", 5), JOAO2("2 João", 1), JOAO3("3 João", 1),
    JUDAS("Judas", 1), APOCALIPSE("Apocalipse", 22);

    private String nomeLivro;
    private int capitulos;

    Novo(String nomeLivro, int capitulos){
        this.nomeLivro = nomeLivro;
        this. capitulos = capitulos;
    }
}

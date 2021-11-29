package com.leitura.biblia.model;

import lombok.Getter;

@Getter
public enum Antigo {

    GENESIS("Gênesis", 50), EXODO("Êxodo", 40),
    LEVITICO("Levítico", 27), NUMEROS("Números", 36),
    DEUTERONOMIO("Deuteronômio", 34), JOSUE("Josué", 24),
    JUIZES("Juízes", 21), RUTE("Rute", 4), SAMUEL1("1 Samuel", 31),
    SAMUEL2("2 Samuel", 24), REIS1("1 Reis", 22), REIS2("2 Reis", 25),
    CRONICAS1("1 Crônicas", 29), CRONICAS2("2 Crônicas", 36), ESDRAS("Esdras", 10),
    NEEMIAS("Neemias", 13), ESTER("Ester", 10), JO("Jó", 42),
    SALMOS("Salmos", 150), PROVERBIOS("Provérbios", 31), ECLESIASTES("Eclesiastes", 12),
    CANTARES("Cantares", 8), ISAIAS("Isaías", 66), JEREMIAS("Jeremias", 52),
    LAMENTAÇÕES("Lamentações", 5), EZEQUIEL("Ezequiel", 48), DANIEL("Daniel", 12),
    OSEIAS("Oséias", 14), JOEL("Joel", 3), AMOS("Amós", 9),
    OBADIAS("Obadias", 1), JONAS("Jonas", 4), MIQUEIAS("Miquéias", 7),
    NAUM("Naum", 3), HABACUQUE("Habacuque", 3), SOFONIAS("Sofonias", 3),
    AGEU("Ageu", 2), ZACARIAS("Zacarias", 14), MALAQUIAS("Malaquias", 4);

    private String nomeLivro;
    private int capitulos;

    Antigo(String nomeLivro, int capitulos) {
        this.nomeLivro = nomeLivro;
        this.capitulos = capitulos;
    }
}

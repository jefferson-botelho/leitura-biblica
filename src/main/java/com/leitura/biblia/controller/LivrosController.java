package com.leitura.biblia.controller;

import com.leitura.biblia.impl.GerarLivrosDTO;
import com.leitura.biblia.service.LivrosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivrosController {

    private final LivrosService livrosService;

    public LivrosController(LivrosService livrosService){
        this.livrosService = livrosService;
    }

    @GetMapping
    public ResponseEntity<List<GerarLivrosDTO>> obterLivros(){
        return ResponseEntity.ok(livrosService.obterLivros());
    }

    @GetMapping("/gerarlivros")
    public ResponseEntity<List<GerarLivrosDTO>> gerarLivros(){
        livrosService.gerarLivros();
        return ResponseEntity.ok(livrosService.obterLivros());
    }

}

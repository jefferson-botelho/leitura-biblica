package com.leitura.biblia.controller;

import com.leitura.biblia.impl.GerarLivrosDTO;
import com.leitura.biblia.service.LivrosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public ResponseEntity<GerarLivrosDTO> obterLivrosPorId(@PathVariable String id){
        return ResponseEntity.ok(livrosService.obterLivrosPorId(id));
    }

    @PutMapping
    public ResponseEntity atualizarLeitura(@RequestBody GerarLivrosDTO gerarLivrosDTO){
        livrosService.atualizarLeitura(gerarLivrosDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}

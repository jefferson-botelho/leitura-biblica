package com.leitura.biblia.service;

import com.leitura.biblia.impl.GerarLivrosDTO;
import com.leitura.biblia.repository.LivrosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivrosService {

    private final LivrosRepository livrosRepository;

    public LivrosService(LivrosRepository livrosRepository) {
        this.livrosRepository = livrosRepository;
    }

    public List<GerarLivrosDTO> obterLivros(){
        return livrosRepository.findAll();
    }

    public void gerarLivros(){
        GerarLivrosDTO gerarLivrosDTO = new GerarLivrosDTO();
        livrosRepository.insert(gerarLivrosDTO.gerarLivrosBiblia());
    }
}

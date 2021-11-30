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

    public GerarLivrosDTO obterLivrosPorId(String id){
        return livrosRepository.findById(id).orElseThrow(() -> new RuntimeException(
                String.format("Seu registro não foi localizado!")
        ));
    }

    public void atualizarLeitura(GerarLivrosDTO gerarLivrosDTO){
        GerarLivrosDTO salvo = livrosRepository.findById(gerarLivrosDTO.getId())
                .orElseThrow(() -> new RuntimeException(
                String.format("Seu registro não foi localizado!")
        ));

        salvo.setAntigoTestamento(gerarLivrosDTO.getAntigoTestamento());
        salvo.setNovoTestamento(gerarLivrosDTO.getNovoTestamento());
        livrosRepository.save(gerarLivrosDTO);
    }
}

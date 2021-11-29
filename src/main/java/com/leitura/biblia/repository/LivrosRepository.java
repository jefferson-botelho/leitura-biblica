package com.leitura.biblia.repository;

import com.leitura.biblia.impl.GerarLivrosDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LivrosRepository extends MongoRepository<GerarLivrosDTO, String> {
}

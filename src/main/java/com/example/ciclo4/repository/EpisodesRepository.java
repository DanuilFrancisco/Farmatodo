package com.example.ciclo4.repository;


import com.example.ciclo4.interfaces.EpisodesInterface;


import com.example.ciclo4.model.Episodes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Repository
public class EpisodesRepository {

    @Autowired
    private EpisodesInterface episodesInterfaceRepository;

    /*
    Template es alternativa a sentenciar en la interface
    JDBC Template para sabes SQL
     */
    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Episodes> getAll() {
        return (List<Episodes>) episodesInterfaceRepository.findAll();
    }

    public Optional<Episodes> getEpisodes(int episode) {
        return episodesInterfaceRepository.findById(episode);
    }

    public Episodes create(Episodes episodes) {
        return episodesInterfaceRepository.save(episodes);
    }

    public void update(Episodes episodes) {
        episodesInterfaceRepository.save(episodes);
    }

    public void delete(Episodes episodes) {
        episodesInterfaceRepository.delete(episodes);
    }

}


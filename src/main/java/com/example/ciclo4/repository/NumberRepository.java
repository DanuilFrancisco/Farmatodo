package com.example.ciclo4.repository;

import com.example.ciclo4.interfaces.EpisodesInterface;
import com.example.ciclo4.interfaces.NumberInterface;
import com.example.ciclo4.model.Episodes;
import com.example.ciclo4.model.Number;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class NumberRepository {

    @Autowired
    private NumberInterface numberInterfaceRepository;

    /*
    Template es alternativa a sentenciar en la interface
    JDBC Template para sabes SQL
     */
    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Number> getAll() {
        return (List<Number>) numberInterfaceRepository.findAll();
    }

    public Optional<Number> getNumber(int number) {
        return numberInterfaceRepository.findById(number);
    }

    public Number create(Number number) {
        return numberInterfaceRepository.save(number);
    }

    public void update(Number number) {
        numberInterfaceRepository.save(number);
    }

    public void delete(Number number) {
        numberInterfaceRepository.delete(number);
    }

}
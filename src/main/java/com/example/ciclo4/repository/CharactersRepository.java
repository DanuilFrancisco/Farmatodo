package com.example.ciclo4.repository;


import com.example.ciclo4.interfaces.CharactersInterface;
import com.example.ciclo4.model.Characters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CharactersRepository {

    @Autowired
    private CharactersInterface charactersInterfaceRepository;

    public List<Characters> getAll() {
        return (List<Characters>) charactersInterfaceRepository.findAll();
    }

    public Optional<Characters> getCharacter(String name) {
        return charactersInterfaceRepository.findById(name);
    }

    public Characters create(Characters characters) {
        return charactersInterfaceRepository.save(characters);
    }

    public void update(Characters characters) {
        charactersInterfaceRepository.save(characters);
    }

    public void delete(Characters characters) {
        charactersInterfaceRepository.delete(characters);
    }

}
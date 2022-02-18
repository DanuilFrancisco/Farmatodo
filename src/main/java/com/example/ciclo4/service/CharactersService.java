package com.example.ciclo4.service;


import com.example.ciclo4.model.Characters;
import com.example.ciclo4.repository.CharactersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CharactersService {

    @Autowired
    private CharactersRepository charactersRepository;

    public List<Characters> getAll() {
        return charactersRepository.getAll();
    }

    public Optional<Characters> getCharacter(String name) {
        return charactersRepository.getCharacter(name);
    }

    public Characters create(Characters characters) {

        if (characters.getName() == null) {
            return characters;
        } else {
            return charactersRepository.create(characters);
        }
    }


    public Characters update(Characters characters) {

        if (characters.getName() != null) {
            Optional<Characters> charactersDb = charactersRepository.getCharacter(characters.getName());
            if (!charactersDb.isEmpty()) {

                if (characters.getName() != null) {
                    charactersDb.get().setName(characters.getName());
                }
                if (characters.getSpecies() != null) {
                    charactersDb.get().setSpecies(characters.getSpecies());
                }
                if (characters.getGender() != null) {
                    charactersDb.get().setGender(characters.getGender());
                }
                if (characters.getImage() != null) {
                    charactersDb.get().setImage(characters.getImage());
                }


                charactersRepository.update(charactersDb.get());
                return charactersDb.get();
            } else {
                return characters;
            }
        } else {
            return characters;
        }
    }

    public boolean delete(String name) {
        Boolean aBoolean = getCharacter(name).map(characters -> {
            charactersRepository.delete(characters);
            return true;
        }).orElse(false);
        return aBoolean;
    }

}
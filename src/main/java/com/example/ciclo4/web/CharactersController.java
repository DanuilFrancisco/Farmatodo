package com.example.ciclo4.web;


import com.example.ciclo4.model.Characters;

import com.example.ciclo4.service.CharactersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import java.util.Optional;


@RestController
@RequestMapping("/api/character")
@CrossOrigin("*")
public class CharactersController {
    @Autowired
    private CharactersService charactersService;

    @GetMapping("/all")
    public List<Characters> getAll() {
        return charactersService.getAll();
    }

    @GetMapping("/{name}")
    public Optional<Characters> getCharacter(@PathVariable("name") String name) {
        return charactersService.getCharacter(name);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Characters create(@RequestBody Characters characters) {
        return charactersService.create(characters);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Characters update(@RequestBody Characters characters) {
        return charactersService.update(characters);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") String name) {
        return charactersService.delete(name);
    }

}

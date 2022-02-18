package com.example.ciclo4.web;


import com.example.ciclo4.model.Number;
import com.example.ciclo4.service.NumberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/number")
@CrossOrigin("*")
public class NumberController {

    @Autowired
    private NumberService numberService;

    @GetMapping("/all")
    public List<Number> getAll() {
        return numberService.getAll();
    }

    @GetMapping("/{number}")
    public Optional<Number> getNumber(@PathVariable("number") Integer number) {
        return numberService.getNumber(number);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Number create(@RequestBody Number number) {
        return numberService.create(number);
    }
}

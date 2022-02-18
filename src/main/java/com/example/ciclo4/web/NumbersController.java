package com.example.ciclo4.web;


import com.example.ciclo4.model.Episodes;
import com.example.ciclo4.model.Numbers;
import com.example.ciclo4.service.EpisodesService;
import com.example.ciclo4.service.NumberService;
import com.example.ciclo4.service.NumbersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/numbers")
@CrossOrigin("*")
public class NumbersController {

    @Autowired
    private NumbersService numbersService;

    @GetMapping("/all")
    public List<Numbers> getAll() {
        return numbersService.getAll();
    }

    @GetMapping("/{numbers}")
    public Optional<Numbers> getNumbers(@PathVariable("numbers") int numbers) {
        return numbersService.getNumbers(numbers);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Numbers create(@RequestBody Numbers numbers) {
        return numbersService.create(numbers);
    }
}

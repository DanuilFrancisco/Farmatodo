package com.example.ciclo4.service;

import com.example.ciclo4.model.Location;
import com.example.ciclo4.model.Number;
import com.example.ciclo4.repository.LocationRepository;
import com.example.ciclo4.repository.NumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NumberService {

    @Autowired
    private NumberRepository numberRepository;

    public List<Number> getAll() {
        return numberRepository.getAll();
    }

    public Optional<Number> getNumber(Integer number) {
        return numberRepository.getNumber(number);
    }

    public Number create(Number number) {

        if (number.getNumber() == null) {
            return number;
        } else {
            return numberRepository.create(number);
        }
    }
}

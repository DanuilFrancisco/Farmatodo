package com.example.ciclo4.service;

import com.example.ciclo4.model.Number;
import com.example.ciclo4.model.Numbers;
import com.example.ciclo4.repository.NumberRepository;
import com.example.ciclo4.repository.NumbersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NumbersService {

    @Autowired
    private NumbersRepository numbersRepository;

    public List<Numbers> getAll() {
        return numbersRepository.getAll();
    }

    public Optional<Numbers> getNumbers(Integer numbers) {
        return numbersRepository.getNumbers(numbers);
    }

    public Numbers create(Numbers numbers) {

        if (numbers.getNumbers() == null) {
            return numbers;
        } else {
            return numbersRepository.create(numbers);
        }
    }
}

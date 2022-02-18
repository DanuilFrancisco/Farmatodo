package com.example.ciclo4.repository;

import com.example.ciclo4.interfaces.NumberInterface;
import com.example.ciclo4.interfaces.NumbersInterface;
import com.example.ciclo4.model.Number;
import com.example.ciclo4.model.Numbers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class NumbersRepository {

    @Autowired
    private NumbersInterface numbersInterfaceRepository;

    /*
    Template es alternativa a sentenciar en la interface
    JDBC Template para sabes SQL
     */
    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Numbers> getAll() {
        return (List<Numbers>) numbersInterfaceRepository.findAll();
    }

    public Optional<Numbers> getNumbers(int numbers) {
        return numbersInterfaceRepository.findById(numbers);
    }

    public Numbers create(Numbers numbers) {
        return numbersInterfaceRepository.save(numbers);
    }

    public void update(Numbers numbers) {
        numbersInterfaceRepository.save(numbers);
    }

    public void delete(Numbers numbers) {
        numbersInterfaceRepository.delete(numbers);
    }

}
package com.example.ciclo4.interfaces;

import com.example.ciclo4.model.Location;
import com.example.ciclo4.model.Number;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NumberInterface extends MongoRepository<Number, Integer> {

}

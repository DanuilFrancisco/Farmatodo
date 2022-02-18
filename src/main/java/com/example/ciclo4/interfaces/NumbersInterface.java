package com.example.ciclo4.interfaces;

import com.example.ciclo4.model.Location;
import com.example.ciclo4.model.Numbers;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NumbersInterface extends MongoRepository<Numbers, Integer> {

}

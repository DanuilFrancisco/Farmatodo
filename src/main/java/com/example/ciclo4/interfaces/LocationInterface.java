package com.example.ciclo4.interfaces;

import com.example.ciclo4.model.Location;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LocationInterface extends MongoRepository<Location, String> {
    //public List<Accessory> findByPriceLessThanEqual(double price);
    //public List<Accessory> findByDescriptionContainingIgnoreCase(String description);
}

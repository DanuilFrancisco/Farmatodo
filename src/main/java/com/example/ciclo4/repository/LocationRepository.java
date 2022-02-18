package com.example.ciclo4.repository;

import com.example.ciclo4.interfaces.LocationInterface;

import com.example.ciclo4.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class LocationRepository {

    @Autowired
    private LocationInterface locationInterfaceRepository;

    public List<Location> getAll() {
        return locationInterfaceRepository.findAll();
    }

    public Optional<Location> getLocation(String name) { return locationInterfaceRepository.findById(name);
    }
    public Location create(Location location) {
        return locationInterfaceRepository.save(location);
    }

    public void update(Location location) {
        locationInterfaceRepository.save(location);
    }

    public void delete(Location location) {
        locationInterfaceRepository.delete(location);
    }


}

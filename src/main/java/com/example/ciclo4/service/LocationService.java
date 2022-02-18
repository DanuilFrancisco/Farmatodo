package com.example.ciclo4.service;

import com.example.ciclo4.model.Location;
import com.example.ciclo4.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {


    @Autowired
    private LocationRepository locationRepository;

    public List<Location> getAll() {
        return locationRepository.getAll();
    }

    public Optional<Location> getLocation(String name) {
        return locationRepository.getLocation(name);
    }

    public Location create(Location location) {

        if (location.getName() == null) {
            return location;
        } else {
            return locationRepository.create(location);
        }
    }

    public Location update(Location location) {

        if (location.getName() != null) {
            Optional<Location> locationDb = locationRepository.getLocation(location.getName());
            if (!locationDb.isEmpty()) {

                if (location.getName()!= null) {
                    locationDb.get().setName(location.getName());
                }

                if (location.getType() != null) {
                    locationDb.get().setType(location.getType());
                }
                if (location.getDimension() != null) {
                    locationDb.get().setDimension(location.getDimension());
                }

                locationRepository.update(locationDb.get());
                return locationDb.get();
            } else {
                return location;
            }
        } else {
            return location;
        }
    }

    public boolean delete(String name) {
        Boolean aBoolean = getLocation(name).map(location -> {
            locationRepository.delete(location);
            return true;
        }).orElse(false);
        return aBoolean;
    }

}

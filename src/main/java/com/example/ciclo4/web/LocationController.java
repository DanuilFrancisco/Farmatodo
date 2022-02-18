package com.example.ciclo4.web;



import com.example.ciclo4.model.Location;

import com.example.ciclo4.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/location")
@CrossOrigin("*")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/all")
    public List<Location> getAll() {
        return locationService.getAll();
    }

    @GetMapping("/{name}")
    public Optional<Location> getLocation(@PathVariable("name") String name) {
        return locationService.getLocation(name);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Location create(@RequestBody Location gadget) {
        return locationService.create(gadget);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Location update(@RequestBody Location gadget) {
        return locationService.update(gadget);
    }

    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("reference") String name) {
        return locationService.delete(name);
    }

}

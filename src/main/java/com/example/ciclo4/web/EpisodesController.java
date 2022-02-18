package com.example.ciclo4.web;



import com.example.ciclo4.model.Episodes;

import com.example.ciclo4.service.EpisodesService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/episode")
@CrossOrigin("*")
public class EpisodesController {

    @Autowired
    private EpisodesService episodesService;

    @GetMapping("/all")
    public List<Episodes> getAll() {
        return episodesService.getAll();
    }

    @GetMapping("/{episode}")
    public Optional<Episodes> getEpisodes(@PathVariable("episode") int episode) {
        return episodesService.getEpisode(episode);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Episodes create(@RequestBody Episodes gadget) {
        return episodesService.create(gadget);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Episodes update(@RequestBody Episodes gadget) {
        return episodesService.update(gadget);
    }

    @DeleteMapping("/{episode}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("episode") int episode) {
        return episodesService.delete(episode);
    }
}
package com.example.ciclo4.service;


import com.example.ciclo4.model.Episodes;

import com.example.ciclo4.repository.EpisodesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EpisodesService {

    @Autowired
    private EpisodesRepository episodesRepository;

    public List<Episodes> getAll() {
        return episodesRepository.getAll();
    }

    public Optional<Episodes> getEpisode(int episode) {
        return episodesRepository.getEpisodes(episode);
    }

    public Episodes create(Episodes episodes) {

        if (episodes.getEpisode() == null) {
            return episodes;
        } else {
            return episodesRepository.create(episodes);
        }

    }

    public Episodes update(Episodes episodes) {

        if (episodes.getEpisode() != null) {
            Optional<Episodes> episodesDb = episodesRepository.getEpisodes(episodes.getEpisode());
            if (!episodesDb.isEmpty()) {

                if (episodes.getEpisode() != null) {
                    episodesDb.get().setEpisode(episodes.getEpisode());
                }
                if (episodes.getEpisodeName() != null) {
                    episodesDb.get().setEpisodeName(episodes.getEpisodeName());
                }
                if (episodes.getCharacters() != null) {
                    episodesDb.get().setCharacters(episodes.getCharacters());
                }

                episodesRepository.update(episodesDb.get());
                return episodesDb.get();
            } else {
                return episodes;
            }
        } else {
            return episodes;
        }
    }


    public boolean delete(int episode) {
        Boolean aBoolean = getEpisode(episode).map(episodes -> {
            episodesRepository.delete(episodes);
            return true;
        }).orElse(false);
        return aBoolean;
    }



}

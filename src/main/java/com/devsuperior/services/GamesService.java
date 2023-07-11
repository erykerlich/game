package com.devsuperior.services;

import com.devsuperior.dto.GameMinDto;
import com.devsuperior.entities.Game;
import com.devsuperior.repositories.GameReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamesService {

    @Autowired
    private GameReposity gameReposity;
    public List<GameMinDto> findAll() {
        List<Game> result = gameReposity.findAll();
        //strem lib que permite fazer operações com sequencia de dados map tranforma
        return result.stream().map(x -> new GameMinDto(x)).toList();
    }


}

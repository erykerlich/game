package com.devsuperior.services;

import com.devsuperior.dto.GameDto;
import com.devsuperior.dto.GameMinDto;
import com.devsuperior.entities.Game;
import com.devsuperior.repositories.GameReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GamesService {

    @Autowired
    private GameReposity gameReposity;

    @Transactional(readOnly = true)
    public GameDto findById(Long id){
        Game result = gameReposity.findById(id).get();
        GameDto dto = new GameDto((result));
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findAll() {
        List<Game> result = gameReposity.findAll();
        //strem lib que permite fazer operações com sequencia de dados map tranforma
        return result.stream().map(x -> new GameMinDto(x)).toList();
    }


}

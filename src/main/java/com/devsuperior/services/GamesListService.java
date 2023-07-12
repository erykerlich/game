package com.devsuperior.services;

import com.devsuperior.dto.GameDto;
import com.devsuperior.dto.GameListDto;
import com.devsuperior.dto.GameMinDto;
import com.devsuperior.entities.Game;
import com.devsuperior.entities.GameList;
import com.devsuperior.repositories.GameListRepository;
import com.devsuperior.repositories.GameReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GamesListService {

    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDto> findAll() {
        List<GameList> result = gameListRepository.findAll();
        //strem lib que permite fazer operações com sequencia de dados map tranforma
        return result.stream().map(x -> new GameListDto(x)).toList();
    }


}

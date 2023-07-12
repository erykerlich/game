package com.devsuperior.controllers;


import com.devsuperior.dto.GameDto;
import com.devsuperior.dto.GameMinDto;
import com.devsuperior.services.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GamesService gamesService;

    @GetMapping
    public List<GameMinDto> findAll(){
        List<GameMinDto> result = gamesService.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public GameDto findById(@PathVariable Long id){
        GameDto result = gamesService.findById(id);
        return result;
    }


}

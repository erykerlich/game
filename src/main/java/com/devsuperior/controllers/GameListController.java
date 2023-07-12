package com.devsuperior.controllers;


import com.devsuperior.dto.GameDto;
import com.devsuperior.dto.GameListDto;
import com.devsuperior.dto.GameMinDto;
import com.devsuperior.entities.Game;
import com.devsuperior.entities.GameList;
import com.devsuperior.services.GamesListService;
import com.devsuperior.services.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GamesListService gamesListService;

    @Autowired
    private GamesService gamesService;

    @GetMapping
    public List<GameListDto> findAll(){
        List<GameListDto> result = gamesListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDto> findByList(@PathVariable Long listId){
        List<GameMinDto> result = gamesService.findByList(listId);
        return result;
    }






}

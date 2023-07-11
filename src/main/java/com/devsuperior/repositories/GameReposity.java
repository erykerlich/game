package com.devsuperior.repositories;

import com.devsuperior.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameReposity extends JpaRepository<Game, Long> {



}

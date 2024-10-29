package com.treizer.lombok_app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.treizer.lombok_app.persistence.entities.PlayerEntity;
import com.treizer.lombok_app.persistence.repositories.IPlayerRepository;

@SpringBootApplication
public class LombokAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokAppApplication.class, args);
	}

	@Autowired
	private IPlayerRepository playerRepository;

	@Bean
	CommandLineRunner init() {
		return args -> {
			List<PlayerEntity> players = this.playerRepository.findAll();

			System.out.println(players);
		};
	}

}

package com.treizer.lombok_app.persistence.repositories;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.treizer.lombok_app.persistence.entities.PlayerEntity;

@Repository
public interface IPlayerRepository extends ListCrudRepository<PlayerEntity, Long> {

}

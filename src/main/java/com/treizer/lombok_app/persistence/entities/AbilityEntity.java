package com.treizer.lombok_app.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "abilities")
public class AbilityEntity {

    @Id
    private Long id;

    private String name;

}

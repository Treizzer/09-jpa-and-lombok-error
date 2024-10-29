package com.treizer.lombok_app.persistence.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = { "abilities" })
@EqualsAndHashCode(exclude = { "abilities" })
@Entity
@Table(name = "players")
public class PlayerEntity {

    @Id
    private Long id;

    private String name;

    // Only will be return it when I call explicit way
    // the getAbilities, doesn't works at toString()
    // FetchType.EAGER not is the best option in lists
    @OneToMany(targetEntity = AbilityEntity.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "player_id")
    private List<AbilityEntity> abilities;

}

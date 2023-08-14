package com.wiwiel.mytimeline.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "universe_id")
    private Universe universe;

    private String origin;
    private String occupation;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "character")
    private Set<TimelineEntry> timeline;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Author owner;

    private Boolean isPrivate;
}

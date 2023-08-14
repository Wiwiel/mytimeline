package com.wiwiel.mytimeline.repositories;

import com.wiwiel.mytimeline.model.Character;
import org.springframework.data.repository.CrudRepository;

public interface CharacterRepository extends CrudRepository<Character, Long> {
}

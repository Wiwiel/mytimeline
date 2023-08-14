package com.wiwiel.mytimeline.repositories;

import com.wiwiel.mytimeline.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

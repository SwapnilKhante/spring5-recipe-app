package org.springphony.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springphony.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

  Optional<UnitOfMeasure> findByDescription(String description);
}

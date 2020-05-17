package org.springphony.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springphony.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}

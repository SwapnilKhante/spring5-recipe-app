package org.springphony.services;

import org.springphony.domain.Recipe;

import java.util.Set;

public interface RecipeService {
  Set<Recipe> getRecipes();
}

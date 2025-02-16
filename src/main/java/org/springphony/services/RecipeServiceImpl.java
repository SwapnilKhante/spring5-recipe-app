package org.springphony.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springphony.domain.Recipe;
import org.springphony.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

  private final RecipeRepository recipeRepository;

  public RecipeServiceImpl(RecipeRepository recipeRepository) {
    this.recipeRepository = recipeRepository;
  }

  @Override
  public Set<Recipe> getRecipes() {
    Set<Recipe> recipes = new HashSet<>();
    recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
    // recipeRepository.findAll().iterator().forEachRemaining(recipe -> recipes.add(recipe));
    return recipes;
  }
}

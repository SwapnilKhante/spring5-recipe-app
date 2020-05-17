package org.springphony.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springphony.services.RecipeService;

@Controller
public class IndexController {

  private final RecipeService recipeService;

  public IndexController(RecipeService recipeService) {
    this.recipeService = recipeService;
  }

  @RequestMapping({"","/","index","index.html"})
  public String index(Model model) {
    model.addAttribute("recipes", recipeService.getRecipes());
    return "index";
  }
}

package org.springphony.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter @Setter
@Entity
public class Recipe {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String description;
  private Integer prepTime;
  private Integer cookTime;
  private Integer serving;
  private String source;
  private String url;
  private String directions;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
  private Set<Ingredient> ingredients;
  
  // todo add
  //private Difficulty difficulty;
  @Lob
  private Byte[] image;

  @OneToOne(cascade = CascadeType.ALL)
  private Notes notes;

}

package com.greenfoxacademy.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by User on 2017. 05. 04..
 */
@Getter
@Setter
public class Fox {

  String name;
  List<String> tricks;
  List<String> learnableTricks = new ArrayList<>(Arrays.asList("Write HTML", "Learn Java Basics", "Understand Spring stuff", "Make coffee", "Make more coffee", "Relax", "Fly", "Sing"));
  String food;
  String drink;

  public Fox() {
    this.name = "Blueberry";
    this.drink = "water";
    this.food = "salad";
    this.tricks = new ArrayList<>();
  }

  public void addTrick(String trick) {
    tricks.add(trick);
  }

}





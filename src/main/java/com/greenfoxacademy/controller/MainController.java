package com.greenfoxacademy.controller;

import com.greenfoxacademy.model.Fox;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by User on 2017. 05. 04..
 */
@Controller
public class MainController {

  @Autowired
  Fox fox;
  List<String> learnableTricks;


  @RequestMapping(value = "/")
  public ModelAndView home() {
    ModelAndView model = new ModelAndView();
    model.setViewName("index");
    model.addObject("fox", fox);
    return model;
  }

  @RequestMapping(value = "/nutrition")
  public ModelAndView nutrition() {
    ModelAndView model = new ModelAndView();
    model.setViewName("nutrition");
    model.addObject("fox", fox);
    return model;
  }

  @RequestMapping(value = "/tricks")
  public ModelAndView tricks() {
    ModelAndView model = new ModelAndView();
    model.setViewName("tricks");
    model.addObject("fox", fox);
    return model;
  }

  @RequestMapping(value = "/addnutrition")
  public String addNutrition(@RequestParam String food, String drink) {
    fox.setFood(food);
    fox.setDrink(drink);
    return "redirect:/";
  }

  @RequestMapping(value = "/addtrick")
  public String addTrick(@RequestParam String addTrick) {
    for (int i = 0; i < fox.getLearnableTricks().size(); i++) {
      int index;
      if (addTrick.equals(fox.getLearnableTricks().get(i))) {
        index = i;
        fox.getLearnableTricks().remove(index);
      }
    }
    fox.addTrick(addTrick);
    return "redirect:/tricks";
  }
}


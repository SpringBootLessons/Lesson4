package com.example.lesson4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

  @RequestMapping("/loadform") // The “/loadform” path displays the template
  // formtemplate to the user.
  public String loadFormPage(){
    return "formtemplate";
  }

  @RequestMapping("/processform") // The “/processform” path processes both
  // get and post requests in the same way
  // @RequestParam means that the loadFromPage method expects a parameter -
  // here it is called login
  public String loadFormPage(@RequestParam("login") String login, Model model){
    model.addAttribute("loginval", login); // "loginval" is the value
    return "confirm";
  }


}

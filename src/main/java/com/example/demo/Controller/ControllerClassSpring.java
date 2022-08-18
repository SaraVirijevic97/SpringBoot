package com.example.demo.Controller;

import com.example.demo.service.ClassServiceSpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerClassSpring {

    @Autowired

    ClassServiceSpring classServiceSpring;

    @PostMapping ("/StringTestPath")
    public String getBalloon(@RequestParam("string")String string, Model model){
        String str = "In this string we found " + classServiceSpring.maxNumberOfBalloons(string) + " balloons";
        model.addAttribute("str",str);

        return "htmlHome";
    }

    @GetMapping("/")
    public String htmlHome() {
        return "htmlHome";
    }

}

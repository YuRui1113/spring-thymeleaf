/*
 * File: src\main\java\com\taylor\springthymeleaf\controllers\HomeController.java
 * Project: jpa
 * Created Date: Tuesday, December 19th 2023, 9:27:36 pm
 * Author: Rui Yu (yurui_113@hotmail.com)
 * -----
 * Last Modified: Friday, 22nd December 2023 6:29:24 pm
 * Modified By: Rui Yu (yurui_113@hotmail.com>)
 * -----
 * Copyright (c) 2023 Rui Yu
 * -----
 * HISTORY:
 * Date                     	By       	Comments
 * -------------------------	---------	----------------------------------------------------------
 * Tuesday, December 19th 2023	Rui Yu		Initial version
 */

package com.taylor.springthymeleaf.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.taylor.springthymeleaf.models.Student;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        return "redirect:index";
    }

    @GetMapping("/index")
    public String index(Model model) {
        Map<String, String> map = new HashMap<>();
        map.put("technique", "Spring MVC");
        model.addAttribute("templateEngine", "Thymeleaf");
        model.mergeAttributes(map);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Taylor", true, 44, 80));
        students.add(new Student("Tommy", true, 45, 82));
        students.add(new Student("Marisa", false, 40, 84));
        students.add(new Student("Henry", true, 47, 85));
        students.add(new Student("Jerry", true, 43, 87));
        students.add(new Student("Wavel", false, 44, 89));
        model.addAttribute("students", students);

        return "index";
    }

    /*
     * @GetMapping("/index")
     * public String index(ModelMap model) {
     * model.addAttribute("technique", "Spring MVC");
     * model.put("templateEngine", "Thymeleaf");
     * return "index";
     * 
     * }
     */

    /*
     * @GetMapping("/index")
     * public ModelAndView index() {
     * ModelAndView modelAndView = new ModelAndView("index");
     * modelAndView.addObject("technique", "Spring MVC");
     * modelAndView.addObject("templateEngine", "Thymeleaf");
     * 
     * return modelAndView;
     * }
     */
}
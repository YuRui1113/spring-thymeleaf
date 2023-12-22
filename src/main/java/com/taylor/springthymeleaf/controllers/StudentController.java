/*
 * File: src\main\java\com\taylor\springthymeleaf\controllers\StudentController.java
 * Project: jpa
 * Created Date: Thursday, December 21st 2023, 12:13:06 pm
 * Author: Rui Yu (yurui_113@hotmail.com)
 * -----
 * Last Modified: Friday, 22nd December 2023 6:29:40 pm
 * Modified By: Rui Yu (yurui_113@hotmail.com>)
 * -----
 * Copyright (c) 2023 Rui Yu
 * -----
 * HISTORY:
 * Date                     	By       	Comments
 * -------------------------	---------	----------------------------------------------------------
 * Thursday, December 21st 2023	Rui Yu		Initial version
 */

package com.taylor.springthymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.taylor.springthymeleaf.models.Student;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping()
    public String addNew(Model model) {
        model.addAttribute("student", new Student());
        return "addNewStudent";
    }

    @PostMapping()
    public String save(Model model, @Valid @ModelAttribute("student") Student student, BindingResult result) {
        if (result.hasErrors()) {
            return "addNewStudent";
        }

        model.addAttribute("student", student);
        return "showSubmitData";
    }
}
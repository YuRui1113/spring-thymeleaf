/*
 * File: src\main\java\com\taylor\springthymeleaf\models\Student.java
 * Project: jpa
 * Created Date: Wednesday, December 20th 2023, 9:26:07 pm
 * Author: Rui Yu (yurui_113@hotmail.com)
 * -----
 * Last Modified: Friday, 22nd December 2023 6:29:51 pm
 * Modified By: Rui Yu (yurui_113@hotmail.com>)
 * -----
 * Copyright (c) 2023 Rui Yu
 * -----
 * HISTORY:
 * Date                     	By       	Comments
 * -------------------------	---------	----------------------------------------------------------
 * Wednesday, December 20th 2023	Rui Yu		Initial version
 */

package com.taylor.springthymeleaf.models;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @NotEmpty(message = "{Name.NotEmpty}")
    private String name;

    @NotNull(message = "{Sex.NotNull}")
    private Boolean sex;

    @NotNull(message = "{Age.NotNull}")
    private Integer age;

    @NotNull(message = "{Score.NotNull}")
    private Integer score;
}
package com.satya.dockerpublish;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * File: HomeController.java Copyright 2021. All rights reserved.
 * <p>
 * This software is the confidential and proprietary information of ABC.
 * You shall not disclose such Confidential Information and shall use it
 * only in accordance with the terms of the license agreement you entered into
 * with ABC.
 * <p>
 * Created on: 24/12/21, Created by: satyaveer.yadav, Version: 1.0,  Project Name: dockerpublish
 * Last updated by: satyaveer.yadav
 */
@RestController
public class HomeController {
    @GetMapping("/")
    public  String home() {
        return "Hello to docker publish";
    }
}

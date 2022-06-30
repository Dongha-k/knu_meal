package com.knu.meal.demo;

import com.knu.meal.demo.util.GetMeal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/meal")
public class MealController {

    @GetMapping("/nuri")
    @ResponseBody
    public Map<String, String> getNuriMeal(){
        return GetMeal.nuri_act();
    }
}

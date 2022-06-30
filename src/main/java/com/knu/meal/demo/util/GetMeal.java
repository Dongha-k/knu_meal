package com.knu.meal.demo.util;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.util.HashMap;
import java.util.Map;

public class GetMeal {
    private static final String nuri_meal_url = "https://dorm.knu.ac.kr/_new_ver/newlife/05.php?get_mode=4";

    public static Map<String, String> nuri_act(){
        Map<String, String> meal = new HashMap<>();
        Connection conn = Jsoup.connect(nuri_meal_url);
        try{
            Document document = conn.get();
            Elements meal_ele = document.getElementsByClass("txt_right");

            if(meal_ele.size() != 3) return null;
            meal.put("breakfast", Tokenizer.remove_tags(meal_ele.get(0).toString()));
            meal.put("lunch", Tokenizer.remove_tags(meal_ele.get(1).toString()));
            meal.put("dinner", Tokenizer.remove_tags(meal_ele.get(2).toString()));

        } catch (IOException e){
            e.printStackTrace();
        }
        return meal;
    }
}

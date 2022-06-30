package com.knu.meal.demo.util;

public class Tokenizer {
    public static String remove_tags(String str){
        return str.replaceAll("<[^>]*>", "").replaceAll("&amp;", "&").trim();
    }
}

package com.qa.jsonConverter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConvertToJson {
    public static Gson gson;

    public static String toJson(Object toJsonObject){
        gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(toJsonObject);
    }

}

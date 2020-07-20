package com.example.demo.util;

import com.example.demo.model.Auto;
import com.example.demo.model.People;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

public class ToJson {
    public String autosToJson(List<Auto> autoList) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.registerTypeAdapter(Auto.class, new AutoAdapter()).create();
        String res = gson.toJson(autoList);
        return res;
    }

    public String peoplesToJson(List<People> peopleList) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.registerTypeAdapter(People.class, new PeopleAdapter()).create();
        String res = gson.toJson(peopleList);
        return res;
    }
}

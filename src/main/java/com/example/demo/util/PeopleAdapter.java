package com.example.demo.util;

import com.example.demo.model.People;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

public class PeopleAdapter implements JsonSerializer<People> {
    @Override
    public JsonElement serialize(People people, Type type, JsonSerializationContext jsc) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("id", people.getId());
        jsonObject.addProperty("name", people.getName());
        jsonObject.addProperty("autos", people.getAutos().toString());
        return jsonObject;
    }
}
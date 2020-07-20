package com.example.demo.util;

import com.example.demo.model.Auto;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

public class AutoAdapter implements JsonSerializer<Auto> {
    @Override
    public JsonElement serialize(Auto auto, Type type, JsonSerializationContext jsc) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("id", auto.getId());
        jsonObject.addProperty("model", auto.getModel());
        jsonObject.addProperty("reg_number", auto.getRegNumber());
        return jsonObject;
    }
}

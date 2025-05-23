package org.architech.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.architech.model.Architecture;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class JsonUtils {
    private static final Gson gson = new Gson();

    public static void saveFile(String path, List<Architecture> data) throws IOException {
        try (FileWriter writer = new FileWriter(path)) {
            gson.toJson(data, writer);
        }
    }

    public static List<Architecture> readFile(String path) throws IOException {
        try (FileReader reader = new FileReader(path)) {
            Type listType = new TypeToken<List<Architecture>>() {}.getType();
            return gson.fromJson(reader, listType);
        }
    }
}

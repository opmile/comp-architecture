package org.architech.services;

import org.architech.model.Architecture;
import org.architech.utils.JsonUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArchitectureRepository {
    private static final String archive = "data.json";

    public void save(List<Architecture> architectures) {
        try {
            JsonUtils.saveFile(archive, architectures);
        } catch (IOException e) {
            System.out.println("error to save file");
        }
    }

    public List<Architecture> load() {
        try {
            return JsonUtils.readFile(archive);
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

}


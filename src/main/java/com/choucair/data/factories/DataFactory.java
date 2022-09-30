package com.choucair.data.factories;

import com.choucair.exceptions.DataNotFoundException;
import com.choucair.models.startsharp.DataStartSharp;
import com.choucair.util.GetEnvironment;
import lombok.SneakyThrows;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import static io.restassured.path.json.JsonPath.from;

public class DataFactory {

    private static final String DATA_PATH = "/data/data.json";

    @SneakyThrows
    public static List<DataStartSharp> getData() {
        return Arrays.asList(from(getDataFile()).getObject("data", DataStartSharp[].class));
    }

    public static DataStartSharp getDataByKey(String key) {
        return getData().stream()
                .filter(a -> a.getKey()
                        .equals(key))
                .findFirst()
                .orElseThrow(() ->
                        new DataNotFoundException(String.format("data with key %s not found", key)));
    }

    @SneakyThrows
    private static URL getDataFile() {
        String path = GetEnvironment.actual() + DATA_PATH;
        URL filePath = DataFactory.class.getClassLoader().getResource(path);
        if (filePath == null) {
            throw new FileNotFoundException("File not found for data: " + path);
        }
        return filePath;
    }
}

package com.choucair.data.factories;

import com.choucair.exceptions.DataNotFoundException;
import com.choucair.models.actor.ChoucairActor;
import com.choucair.util.GetEnvironment;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import static io.restassured.path.json.JsonPath.from;

public class ActorFactory {

    private static final String ACTORS_PATH = "/actors/siigo-actors.json";

    public static List<ChoucairActor> getActors() throws FileNotFoundException {
        return Arrays.asList(from(getActorsFile()).getObject("actors", ChoucairActor[].class));
    }

    public static ChoucairActor getActorByName(String name) throws FileNotFoundException {
        return getActors().stream()
                .filter(a -> a.getName()
                        .equals(name))
                .findFirst()
                .orElseThrow(() ->
                        new DataNotFoundException(String.format("user with name %s not found", name)));
    }

    public static ChoucairActor getActorById(int id) throws FileNotFoundException {
        return getActors().stream()
                .filter(a -> a.getId() == id)
                .findFirst()
                .orElseThrow(() ->
                        new DataNotFoundException(String.format("user with id %s not found", id)));
    }

    private static URL getActorsFile() throws FileNotFoundException {
        String path = GetEnvironment.actual() + ACTORS_PATH;
        URL filePath = ActorFactory.class.getClassLoader().getResource(path);
        if (filePath == null) {
            throw new FileNotFoundException("File not found for actors: " + path);
        }
        return filePath;
    }
}

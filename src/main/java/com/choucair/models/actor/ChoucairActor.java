package com.choucair.models.actor;

import lombok.Data;

import java.util.List;

@Data
public class ChoucairActor {

    private String name;
    private String lastName;
    private String type;
    private String description;
    private Credentials credentials;
    private List<Company> companies;
    private int id;

}
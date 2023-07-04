package com.beto.marvel.api.jar.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CharacterDataWrapper {

    private CharacterDataContainer data;

    public static class CharacterDataContainer {
        public List<Character> results;
    }

    public static class Character {
        public int id;
        public String name;
        public String description;
        public Image thumbnail;
    }

    public static class Image {
        public String path;
        public String extension;
    }
}

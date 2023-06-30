package com.beto.marvel.api.jar.control;

import com.beto.marvel.api.jar.model.entity.CharacterDataWrapper;
import com.beto.marvel.api.jar.service.CharacterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@CrossOrigin
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/character")
public class CharacterController {

    private final CharacterService characterService;

    @GetMapping()
    public CharacterDataWrapper getAll() throws IOException {
        return characterService.findAll();
    }

    @GetMapping("/{characterId}")
    public CharacterDataWrapper getById(@PathVariable("characterId") int characterId) throws IOException {
        return characterService.findById(characterId);
    }
}

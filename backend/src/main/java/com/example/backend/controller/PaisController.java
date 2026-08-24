package com.example.backend.controller;


import com.example.backend.entity.PaisEntity;
import com.example.backend.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paises")
@CrossOrigin(origins = "*")
public class PaisController {

    @Autowired
    private PaisRepository repository;

    @PostMapping
    public PaisEntity salvarPaisEntity(@RequestBody PaisEntity pais){
        return repository.save(pais);
    }

    @GetMapping
    public List<PaisEntity> listarPaises(){
        return repository.findAll();
    }



}

package com.jparepo.h2setup.controller;

import com.jparepo.h2setup.model.H2entity;
import com.jparepo.h2setup.repository.H2repo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class H2controller{
    
    private final H2repo h2;

    public H2controller(H2repo h2) {
        this.h2 = h2;
    }

    @PostMapping
    public H2entity addBook(@RequestBody H2entity book){
        return h2.save(book);
    }

    @GetMapping 
    public List<H2entity> listAll(){
        return h2.findAll();
    }
}
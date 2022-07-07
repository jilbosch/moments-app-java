package com.proves1.imatges.controllers;

import com.proves1.imatges.models.Imatge;
import com.proves1.imatges.models.Moment;
import com.proves1.imatges.repositories.IMomentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class MomentControllers {
    @Autowired
    private IMomentRepository momentRepository;

    @GetMapping("/health")
    String helthcheck() {
        return "benvingut";
    }

    @GetMapping("/moments")
    List<Moment> getAll() {
        var momentsList = this.momentRepository.findAll();
        return momentsList;
    }


    @GetMapping("/moments/{id}")
    Moment moment(@PathVariable Long id) {
        Moment moment = this.momentRepository.findById(id).get();
        return moment;

    }
}

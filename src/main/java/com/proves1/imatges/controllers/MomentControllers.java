package com.proves1.imatges.controllers;

import com.proves1.imatges.models.Imatge;
import com.proves1.imatges.models.Moment;
import com.proves1.imatges.repositories.IMomentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins="*")
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
    Moment getMomentsById(@PathVariable Long id) {
        Moment moment = this.momentRepository.findById(id).get();
        return moment;

    }

    @DeleteMapping("/moments/{id}")
    void deleteMomentsById(@PathVariable Long id) {
        momentRepository.deleteById(id);
    }
    @PostMapping("/moments")
    Moment saveMoments (@RequestBody Moment newMoment){
        Moment moment = this.momentRepository.save(newMoment);
        return moment;
    }
}

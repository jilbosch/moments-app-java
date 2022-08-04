package com.proves1.imatges.controllers;

import com.proves1.imatges.models.Moment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import com.proves1.imatges.repositories.IMomentRepository;

import java.util.List;
@CrossOrigin(origins="*")
@RestController

public class MomentControllers {

    private IMomentRepository momentRepository;
    public MomentControllers(IMomentRepository momentRepository) {
        this.momentRepository = momentRepository;
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
@Autowired
    @DeleteMapping("/moments/{id}")
    void deleteMomentsById(@PathVariable Long id) {
        momentRepository.deleteById(id);
    }
    @PutMapping("/moments/{id}")

    Moment updateMoment(@PathVariable Long id, @RequestBody Moment editedMoment){
        Moment moment = this.momentRepository.findById(id).get();
        moment.setTitle(editedMoment.getTitle());;
        moment.setDescripcion(editedMoment.getDescripcion());
        moment.setImgUrl(editedMoment.getImgUrl());
        Moment updatedMoment = this.momentRepository.save(moment);
        return updatedMoment;
    }
    @PreAuthorize("hasRole('ROLE_USER')")
    @PostMapping("/moments")
    Moment saveMoments (@RequestBody Moment newMoment){
        Moment moment = this.momentRepository.save(newMoment);
        return moment;
    }
    @GetMapping(value = "/moments",params = "search")
    List<Moment> getSearch(@RequestParam String search){
        return momentRepository.findByDescripcionOrTitleContaining(search);
    }
}

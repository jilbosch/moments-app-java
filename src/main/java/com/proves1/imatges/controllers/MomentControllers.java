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
    @PutMapping("/moments/{id}")

    Moment updateMoment(@PathVariable Long id, @RequestBody Moment editedMoment){
        Moment moment = this.momentRepository.findById(id).get();
        moment.setTitle(editedMoment.getTitle());;
        moment.setDescripcion(editedMoment.getDescripcion());
        moment.setImg_Url(editedMoment.getImg_Url());
        Moment updatedMoment = this.momentRepository.save(moment);
        return updatedMoment;
    }
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

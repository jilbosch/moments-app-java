package com.proves1.imatges.controllers;

import com.proves1.imatges.models.Imatge;
import com.proves1.imatges.models.Moment;
import com.proves1.imatges.repositories.IMomentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MomentControllers {
    private IMomentRepository momentRepository;

    @GetMapping("/health")
    String helthcheck() {
        return "benvingut";
    }

    @GetMapping("/moments")
    List<Imatge> getAll() {
        var momentsList = this.momentRepository.findById();
        return moment;
    }



    @GetMapping("/moments/{id}")
    Moment moment(@PathVariable Long id) {
            Moment moment = this.momentRepository.findById(id);
             return moment;

}



    private List<Imatge> getImatgeList() {
        /*return List.of(new Imatge("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/cataratas-victoria-instagram-1599215409.jpg", "cataratas victoria", "cascada d'aigua cataratas victoria"),
                new Imatge("https://1.bp.blogspot.com/-UIVlF1V1efM/Xj7I8GztDjI/AAAAAAAAgCU/G2KAIA5tvWEkzol2j_D5QSeJVkGEfW5YwCLcBGAsYHQ/s640/matthew-henry-Ix1TiS-E17E-unsplash.jpg","edifici" , "edifici reflexat amb l'aigua"),
                new Imatge("https://i.pinimg.com/736x/96/4b/e4/964be4739ab8ba221a7372725df77f2e.jpg", "paisatge urba", "paisatge urba reflexat "));*/
    return null;}
}

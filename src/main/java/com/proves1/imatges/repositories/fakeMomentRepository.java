package com.proves1.imatges.repositories;

import com.proves1.imatges.models.Imatge;

import java.util.List;

public class fakeMomentRepository {
    private List<Imatge> getImatgeList() {
        return List.of(new Imatge("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/cataratas-victoria-instagram-1599215409.jpg", "cataratas victoria", "cascada d'aigua cataratas victoria"),
                new Imatge("https://1.bp.blogspot.com/-UIVlF1V1efM/Xj7I8GztDjI/AAAAAAAAgCU/G2KAIA5tvWEkzol2j_D5QSeJVkGEfW5YwCLcBGAsYHQ/s640/matthew-henry-Ix1TiS-E17E-unsplash.jpg", "edifici", "edifici reflexat amb l'aigua"),
                new Imatge("https://i.pinimg.com/736x/96/4b/e4/964be4739ab8ba221a7372725df77f2e.jpg", "paisatge urba", "paisatge urba reflexat a l'aigua"));
    }

    public List<Imatge> findAll() {
        return getImatgeList();
    }
}
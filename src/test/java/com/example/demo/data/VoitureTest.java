package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture(){
        
        Voiture v = new Voiture("Renault", "Clio", 2018);
        assertEquals("Renault", v.getMarque());
        assertEquals("Clio", v.getModele());
        assertEquals(2018, v.getAnnee());
    }

}

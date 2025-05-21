package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest 
public class VoitureTest {

  
  
    @Test
    @DisplayName("Car creation test") 
    void creerVoiture(){
        Voiture voiture = new Voiture("Ferrari", 5000);
        assertEquals("Ferrari", voiture.getMarque(), "La voiture doit être une Porche");
        assertEquals(5000, voiture.getPrix(), "La voiture doit couter 5000 euros");
        assertEquals(0, voiture.getId(), "Doit être égal à 0");
    }

    @Test 
    @DisplayName("Setters and Getters Test")
    void testSettersAndGetters() {
        Voiture voiture = new Voiture("BMW", 15000);
        voiture.setId(1);
        voiture.setMarque("BMW");
        voiture.setPrix(15000);

        assertEquals(1, voiture.getId());
        assertEquals("BMW", voiture.getMarque());
        assertEquals(15000,voiture.getPrix());
    }

   

}
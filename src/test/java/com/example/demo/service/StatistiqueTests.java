package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.demo.data.Voiture;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.*;


@SpringBootTest
public class StatistiqueTests {

    @MockBean
    StatistiqueImpl statistiqueImpl;



    public void avecMockito() throws Exception{

        StatistiqueImpl uneStats = new StatistiqueImpl();
        Voiture uneVoiture = mock(Voiture.class);


        when(uneVoiture.getPrix()).thenReturn(1000);
        uneStats.ajouter(uneVoiture);
        Echantillon e = uneStats.prixMoyen();
        assertEquals(e.getPrixMoyen(),1000);
    }

}
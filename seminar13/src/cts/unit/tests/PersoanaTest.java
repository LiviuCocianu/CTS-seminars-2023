package cts.unit.tests;

import cts.unit.clase.IPersoana;
import cts.unit.clase.NouNascutException;
import cts.unit.clase.NullCNPException;
import cts.unit.clase.Persoana;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class PersoanaTest {
    @Test
    void getVarstaTestRight() {
        IPersoana persoana = new Persoana("Costel Petru", "5010453643002");
        assertEquals(22, persoana.getVarsta());
    }

    @Test
    void getVarstaTestBoundaryNou() {
        IPersoana persoana = new Persoana("Costel Petru", "5230524643002");
        assertEquals(0, persoana.getVarsta());
    }

    @Test
    void getVarstaTestBoundaryInf() {
        IPersoana persoana = new Persoana("Costel Petru", "5000101643002");
        assertEquals(23, persoana.getVarsta());
    }

    @Test
    void getVarstaTestBoundarySup() {
        IPersoana persoana = new Persoana("Costel Petru", "2991231643002");
        assertEquals(23, persoana.getVarsta());
    }

    // No inversion
    // No cross check

    @Test
    void getVarstaShouldThrowNouNascut() {
        IPersoana persoana = new Persoana("Costel Petru", "5231231643002");
        assertThrows(NouNascutException.class, persoana::getVarsta);
    }

    @Test
    void getVarstaPerformance() {
        IPersoana persoana = new Persoana("Costel Petru", "5001231643002");
        assertTimeout(Duration.ofMillis(100), persoana::getVarsta);
    }

    @Test
    void cnpCaractereCorect() {
        Persoana persoana = new Persoana("Costel Petru", "5001231643002");
        assertEquals(13, persoana.getCNP().length());
    }

    @Test
    void ordineVarstaPersoane() {
        IPersoana persoana1 = new Persoana("Costel Petru", "5001231643002");
        IPersoana persoana2 = new Persoana("Ana Camelia", "2981231643002");

        assertTrue(persoana1.getVarsta() < persoana2.getVarsta());
    }

    @Test
    void getVarstaShouldThrowNullCNP() {
        IPersoana persoana = new Persoana("Costel Petru", null);
        assertThrows(NullCNPException.class, persoana::getVarsta);
    }

    @Test
    void getVarstaCardinality() {
        IPersoana persoana = new Persoana("Costel Petru", "5220515643002");
        assertEquals(1, persoana.getVarsta());
    }

    @Test
    void persoanaShouldInit() {
        Persoana persoana = new Persoana("Costel Petru", "5220515643002");
        Persoana persoana1 = new Persoana();

        persoana1.setNume("Costel Petru");
        persoana1.setCNP("5220515643002");

        assertEquals(persoana.getCNP(), persoana1.getCNP());
        assertEquals(persoana.getNume(), persoana1.getNume());
    }
}
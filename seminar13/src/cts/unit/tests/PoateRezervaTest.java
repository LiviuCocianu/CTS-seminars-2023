package cts.unit.tests;

import cts.unit.clase.IPersoana;
import cts.unit.clase.PachetTuristic;
import cts.unit.dubluri.StubPersoanaMinora;
import cts.unit.dubluri.StubPersoanaMajora;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PoateRezervaTest {
    @Tag("tag1")
    @Test
    void minorNuPoateRezerva() {
        IPersoana stub = new StubPersoanaMinora();
        PachetTuristic pachet = new PachetTuristic(stub, "Bucuresti", 100.0);

        assertFalse(pachet.poateRezerva());
    }

    @Tag("tag2")
    @Test
    void majorPoateRezerva() {
        IPersoana stub = new StubPersoanaMajora();
        PachetTuristic pachet = new PachetTuristic(stub, "Bucuresti", 100.0);

        assertTrue(pachet.poateRezerva());
    }
}
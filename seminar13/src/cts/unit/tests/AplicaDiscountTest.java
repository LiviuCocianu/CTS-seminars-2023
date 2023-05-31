package cts.unit.tests;

import cts.unit.clase.PachetTuristic;
import cts.unit.dubluri.FakePersoana;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AplicaDiscountTest {
    @Tag("tag1")
    @Test
    void nuSeAplicaDiscount() {
        FakePersoana fake = new FakePersoana();
        fake.setGetVarstaValue(6);

        PachetTuristic pachet = new PachetTuristic(fake, "Eforie", 500.0);
        pachet.aplicaDiscountVarstnici(40);
        assertNotEquals(500 - (500 * 0.4), pachet.getPret());
    }

    @Tag("tag2")
    @Test
    void aplicaDiscount() {
        FakePersoana fake = new FakePersoana();
        fake.setGetVarstaValue(89);

        PachetTuristic pachet = new PachetTuristic(fake, "Eforie", 500.0);
        pachet.aplicaDiscountVarstnici(40);
        assertEquals(500 - (500 * 0.4), pachet.getPret());
    }
}
package cts.facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Medic {
    private final List<Pacient> numePacienti;

    public Medic() {
        this.numePacienti = new ArrayList<>();
    }

    public void adaugaPacient(Pacient pacient) {
        this.numePacienti.add(pacient);
    }

    public boolean verificaTrimitere(Pacient pacient) {
        return this.numePacienti.contains(pacient);
    }

    public Pacient getPacient(String nume) {
        return this.numePacienti.stream()
                .filter(pacient -> pacient.getNume().equalsIgnoreCase(nume))
                .findFirst()
                .orElse(new Pacient("Necunoscut", 0));
    }
}

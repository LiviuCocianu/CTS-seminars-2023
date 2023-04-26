package cts.facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private final List<Integer> coduriPaturiLibere;

    public Salon() {
        this.coduriPaturiLibere = new ArrayList<>();
    }

    public void adaugaPatLiber(int codPat) {
        this.coduriPaturiLibere.add(codPat);
    }

    public void ocupaPat(Pacient pacient) {
        if(this.verificaPaturiLibere()) {
            final int codOcupat = this.coduriPaturiLibere.remove(0);
            System.out.println("[Salon] Patul cu codul " + codOcupat + " a fost ocupat de pacientul '" + pacient.getNume() + "'");
        }
    }

    public boolean verificaPaturiLibere() {
        return coduriPaturiLibere.size() > 0;
    }
}

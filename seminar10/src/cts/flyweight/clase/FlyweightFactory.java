package cts.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private final Map<String, ClientBanca> conturi;

    public FlyweightFactory() {
        this.conturi = new HashMap<>();
    }

    public ClientBanca getDetinator(String nume, String nrTelefon, String adresa) {
        if(!this.conturi.containsKey(nume)) {
            this.conturi.put(nume, new Detinator(nume, nrTelefon, adresa));
        }

        return this.conturi.get(nume);
    }
}

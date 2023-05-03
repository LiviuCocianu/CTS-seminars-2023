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
            ClientBanca detinator = new Detinator(nume, nrTelefon, adresa);
            this.conturi.put(nume, detinator);
            return detinator;
        }

        return this.conturi.get(nume);
    }
}

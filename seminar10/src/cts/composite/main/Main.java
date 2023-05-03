package cts.composite.main;

import cts.composite.clase.Filiala;
import cts.composite.clase.Sucursala;
import cts.composite.clase.UnitateBancara;

public class Main {
    public static void main(String[] args) {
        final UnitateBancara sucursala1 = new Sucursala("Sucursala1", 10);
        final UnitateBancara sucursala2 = new Sucursala("Sucursala2", 3);
        final UnitateBancara agentie1 = new Sucursala("Agentie1", 10);
        final UnitateBancara agentie2 = new Sucursala("Agentie2", 40);
        final UnitateBancara filiala1 = new Filiala("Filiala1", 20);
        final UnitateBancara filiala2 = new Filiala("Filiala2", 13);
        final UnitateBancara filiala3 = new Filiala("Filiala3", 4);

        sucursala1.adaugaUnitate(sucursala2);
        sucursala1.adaugaUnitate(agentie1);
        sucursala1.adaugaUnitate(filiala1);

        sucursala2.adaugaUnitate(agentie2);
        sucursala2.adaugaUnitate(filiala2);

        agentie1.adaugaUnitate(filiala3);

        sucursala1.printDescriere("   ");
    }
}

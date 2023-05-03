package cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sucursala implements UnitateBancara {
    private final String nume;
    private final int nrAngajati;
    private final List<UnitateBancara> unitati;

    public Sucursala(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
        this.unitati = new ArrayList<>();
    }

    @Override
    public void adaugaUnitate(UnitateBancara unitate) {
        this.unitati.add(unitate);
    }

    @Override
    public void stergeUnitate(UnitateBancara unitate) {
        this.unitati.remove(unitate);
    }

    @Override
    public UnitateBancara getUnitate(int index) {
        return unitati.get(index);
    }

    @Override
    public void printDescriere(String identare) {
        System.out.println(identare + "Nume: " + this.nume + ", numar angajati: " + this.nrAngajati);
        System.out.println(identare + "+ Subnoduri:");

        for(UnitateBancara unitate : this.unitati) {
            unitate.printDescriere(identare + "   ");
        }
    }
}

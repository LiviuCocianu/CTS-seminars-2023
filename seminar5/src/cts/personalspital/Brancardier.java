package cts.personalspital;

public class Brancardier extends PersonalSpital {
    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Brancardierul " + super.getNume());
    }
}

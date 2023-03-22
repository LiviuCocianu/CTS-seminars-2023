package cts.personalspital;

public class Medic extends PersonalSpital {
    public Medic(String nume) {
        super(nume);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Medicul " + super.getNume());
    }
}

package cts.personalspital;

public class Asistent extends PersonalSpital {
    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Asistentul " + super.getNume());
    }
}

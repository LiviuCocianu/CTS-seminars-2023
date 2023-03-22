package cts.personalspital;

public abstract class PersonalSpital {
    private final String nume;

    public PersonalSpital() {
        this.nume = "N/A";
    }

    public PersonalSpital(String nume) {
        this.nume = nume;
    }

    public abstract void afisareDescriere();

    public String getNume() {
        return nume;
    }
}

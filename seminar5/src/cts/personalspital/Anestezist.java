package cts.personalspital;

public class Anestezist extends PersonalSpital {
    private final int aniVechime;

    public Anestezist(String nume, int aniVechime) {
        super(nume);
        this.aniVechime = aniVechime;
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Anestezistul " + super.getNume() + " are " + this.aniVechime + " ani vechime");
    }
}

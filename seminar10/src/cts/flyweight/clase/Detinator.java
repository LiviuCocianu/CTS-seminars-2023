package cts.flyweight.clase;

public class Detinator implements ClientBanca {
    private final String nume;
    private final String nrTelefon;
    private final String adresa;

    public Detinator(String nume, String nrTelefon, String adresa) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Detinator{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void getDescriere(Cont cont) {
        System.out.println();
        System.out.println(this.toString() + "\n" + cont.toString());
    }
}

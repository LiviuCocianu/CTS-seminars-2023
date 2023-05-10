package cts.template.clase;

public class MasaRezervata extends IMasa {
    private final String oraRezervare;

    public MasaRezervata(int numar, String oraRezervare) {
        super(numar);
        this.oraRezervare = oraRezervare;
    }

    @Override
    protected void curataMasa() {
        System.out.println("Masa " + super.getNumar() + " a fost curatata inainte de ora " + this.oraRezervare);
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("Masa " + super.getNumar() + " are tacamurile asezate inainte de ora " + this.oraRezervare);
    }

    @Override
    protected void invitaPersoane() {
        System.out.println("Va asteptam la ora " + this.oraRezervare + " la masa " + super.getNumar());
    }
}

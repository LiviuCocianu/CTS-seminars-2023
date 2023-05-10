package cts.template.clase;

public class Masa extends IMasa {
    public Masa(int numar) {
        super(numar);
    }

    @Override
    protected void curataMasa() {
        System.out.println("Se curata masa " + super.getNumar() + "...");
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("Se aseaza tacamurile la masa " + super.getNumar() + "...");
    }

    @Override
    protected void invitaPersoane() {
        System.out.println("Se invita persoane la masa " + super.getNumar() + "...");
    }
}

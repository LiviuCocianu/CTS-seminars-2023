package cts.template.clase;

public abstract class IMasa {
    private final int numar;

    public IMasa(int numar) {
        this.numar = numar;
    }

    public int getNumar() {
        return this.numar;
    }

    protected abstract void curataMasa();
    protected abstract void aseazaTacamuri();
    protected abstract void invitaPersoane();

    public final void ocupaMasa() {
        curataMasa();
        aseazaTacamuri();
        invitaPersoane();
    }
}

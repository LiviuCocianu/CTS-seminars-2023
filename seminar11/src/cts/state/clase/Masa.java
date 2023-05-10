package cts.state.clase;

public class Masa {
    private final int numar;
    private IStare stare;

    public Masa(int numar) {
        this.numar = numar;
        this.stare = new StareLibera();
    }

    public int getNumar() {
        return this.numar;
    }

    public IStare getStare() {
        return this.stare;
    }

    protected void setStare(IStare stare) {
        this.stare = stare;
    }

    public void rezervaMasa() {
        IStare stare = new StareRezervata();
        stare.modificaStare(this);
    }

    public void ocupaMasa() {
        IStare stare = new StareOcupata();
        stare.modificaStare(this);
    }

    public void elibereazaMasa() {
        IStare stare = new StareLibera();
        stare.modificaStare(this);
    }
}

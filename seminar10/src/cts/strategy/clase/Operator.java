package cts.strategy.clase;

public class Operator {
    private ModVerificare mod;

    public Operator() {
        this.mod = new VerificarePF();
    }

    public void setModVerificare(ModVerificare mod) {
        this.mod = mod;
    }

    public void verifica() {
        this.mod.verifica();
    }
}

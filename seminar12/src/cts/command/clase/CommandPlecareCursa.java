package cts.command.clase;

public class CommandPlecareCursa implements ICommand {
    private final int nrLinie;
    //dependency inversion
    private final Automobil automobil;

    public CommandPlecareCursa(int nrLinie, Automobil automobil) {
        this.nrLinie = nrLinie;
        this.automobil = automobil;
    }

    @Override
    public void executa() {
        automobil.plecareInCursa(nrLinie);
    }
}

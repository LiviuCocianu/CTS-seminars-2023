package cts.builder.clase;

public class ContBancarBuilderB implements IBuilder {
    private boolean primesteSalariu;
    private boolean cardAtasat;
    private String numeClient;
    private boolean internetBanking;

    public ContBancarBuilderB() {
        this.primesteSalariu = false;
        this.cardAtasat = false;
        this.numeClient = "Necunoscut";
        this.internetBanking = false;
    }

    public boolean isPrimesteSalariu() {
        return primesteSalariu;
    }

    public boolean isCardAtasat() {
        return cardAtasat;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public boolean isInternetBanking() {
        return internetBanking;
    }

    public IBuilder setPrimesteSalariu(boolean primesteSalariu) {
        this.primesteSalariu = primesteSalariu;
        return this;
    }

    public IBuilder setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
        return this;
    }

    public IBuilder setNumeClient(String numeClient) {
        this.numeClient = numeClient;
        return this;
    }

    public IBuilder setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
        return this;
    }

    public ContBancar build() {
        return new ContBancar(this.primesteSalariu, this.cardAtasat, this.numeClient, this.internetBanking);
    }
}

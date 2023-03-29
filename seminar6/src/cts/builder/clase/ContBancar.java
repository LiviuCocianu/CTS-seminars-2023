package cts.builder.clase;

public class ContBancar {
    private boolean primesteSalariu;
    private boolean cardAtasat;
    private String numeClient;
    private boolean internetBanking;

    protected ContBancar() {
        this.primesteSalariu = false;
        this.cardAtasat = false;
        this.numeClient = "Necunoscut";
        this.internetBanking = false;
    }

    protected ContBancar(boolean primesteSalariu, boolean cardAtasat, String numeClient, boolean internetBanking) {
        this.primesteSalariu = primesteSalariu;
        this.cardAtasat = cardAtasat;
        this.numeClient = numeClient;
        this.internetBanking = internetBanking;
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

    protected void setPrimesteSalariu(boolean primesteSalariu) {
        this.primesteSalariu = primesteSalariu;
    }

    protected void setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
    }

    protected void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    protected void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ContBancar{");
        sb.append("primesteSalariu=").append(primesteSalariu);
        sb.append(", cardAtasat=").append(cardAtasat);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", internetBanking=").append(internetBanking);
        sb.append('}');
        return sb.toString();
    }
}

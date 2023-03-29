package cts.builder.clase;

public class ContBancarBuilderA implements IBuilder {
    private final ContBancar contBancar;

    public ContBancarBuilderA() {
        this.contBancar = new ContBancar();
    }

    public ContBancarBuilderA setPrimesteSalariu(boolean primesteSalariu) {
        this.contBancar.setPrimesteSalariu(primesteSalariu);
        return this;
    }

    public ContBancarBuilderA setCardAtasat(boolean cardAtasat) {
        this.contBancar.setCardAtasat(cardAtasat);
        return this;
    }

    public ContBancarBuilderA setNumeClient(String numeClient) {
        this.contBancar.setNumeClient(numeClient);
        return this;
    }

    public ContBancarBuilderA setInternetBanking(boolean internetBanking) {
        this.contBancar.setInternetBanking(internetBanking);
        return this;
    }

    @Override
    public ContBancar build() {
        return this.contBancar;
    }
}

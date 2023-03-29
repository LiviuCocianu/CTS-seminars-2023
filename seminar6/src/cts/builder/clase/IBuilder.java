package cts.builder.clase;

public interface IBuilder {
    public ContBancar build();
    public IBuilder setPrimesteSalariu(boolean primesteSalariu);
    public IBuilder setCardAtasat(boolean cardAtasat);
    public IBuilder setNumeClient(String numeClient);
    public IBuilder setInternetBanking(boolean internetBanking);
}

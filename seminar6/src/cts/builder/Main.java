package cts.builder;

import cts.builder.clase.ContBancar;
import cts.builder.clase.ContBancarBuilderA;
import cts.builder.clase.ContBancarBuilderB;

public class Main {
    public static void main(String[] args) {
        final ContBancar cb = new ContBancarBuilderA()
                .setCardAtasat(true)
                .setInternetBanking(false)
                .setPrimesteSalariu(true)
                .setNumeClient("Gigel Marcel").build();

        System.out.println(cb);

        final ContBancar cb2 = new ContBancarBuilderB()
                .setCardAtasat(true)
                .setInternetBanking(false)
                .setPrimesteSalariu(true)
                .setNumeClient("Sorin Costin").build();

        System.out.println(cb2);
    }
}

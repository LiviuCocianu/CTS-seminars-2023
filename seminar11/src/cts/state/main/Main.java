package cts.state.main;

import cts.state.clase.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(1);

        masa.rezervaMasa();
        masa.rezervaMasa();

        masa.ocupaMasa();

        masa.elibereazaMasa();
    }
}

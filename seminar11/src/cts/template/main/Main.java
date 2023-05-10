package cts.template.main;

import cts.template.clase.IMasa;
import cts.template.clase.Masa;
import cts.template.clase.MasaRezervata;

public class Main {
    public static void main(String[] args) {
        IMasa masa = new Masa(1);
        masa.ocupaMasa();

        IMasa masa2 = new MasaRezervata(2, "14:30");
        masa2.ocupaMasa();
    }
}

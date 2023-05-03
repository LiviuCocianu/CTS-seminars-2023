package cts.flyweight.main;

import cts.flyweight.clase.Cont;
import cts.flyweight.clase.FlyweightFactory;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Cont cont1 = new Cont(2300f, 12);
        Cont cont2 = new Cont(4000f, 14);
        Cont cont3 = new Cont(5000f, 15);

        factory.getDetinator("Ion", "0775742648", "Strada Vasile Alecsandri").getDescriere(cont1);
        factory.getDetinator("Alin", "07382168540", "Strada George Enescu").getDescriere(cont2);
        factory.getDetinator("Ion", "0775742648", "O strada").getDescriere(cont3);
        factory.getDetinator("Alin", "0775742648", "O strada").getDescriere(cont1);
    }
}

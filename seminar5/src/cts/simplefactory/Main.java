package cts.simplefactory;

import cts.personalspital.PersonalSpital;
import cts.personalspital.TipPersonal;

public class Main {
    public static void main(String[] args) {
        SimpleFactory sf = new SimpleFactory();
        PersonalSpital medic = sf.createPersonal(TipPersonal.MEDIC, "Gigel");
        PersonalSpital brancardier = sf.createPersonal(TipPersonal.BRANCARDIER, "Costel");
        PersonalSpital anestezist = sf.createPersonal(TipPersonal.ANESTEZIST, "Marcel", 10);

        medic.afisareDescriere();
        brancardier.afisareDescriere();
        anestezist.afisareDescriere();
    }
}

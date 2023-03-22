package cts.simplefactory;

import cts.personalspital.*;

public class SimpleFactory {
    public PersonalSpital createPersonal(TipPersonal tip, String nume) {
        switch(tip) {
            case BRANCARDIER: return new Brancardier(nume);
            case ASISTENT: return new Asistent(nume);
            case MEDIC: return new Medic(nume);
            default: return null;
        }
    }

    public PersonalSpital createPersonal(TipPersonal tip, String nume, int aniVechime) {
        if (tip == TipPersonal.ANESTEZIST) {
            return new Anestezist(nume, aniVechime);
        }
        return createPersonal(tip, nume);
    }
}

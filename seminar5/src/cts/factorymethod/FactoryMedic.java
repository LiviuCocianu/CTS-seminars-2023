package cts.factorymethod;

import cts.personalspital.Medic;
import cts.personalspital.PersonalSpital;

public class FactoryMedic implements FactoryMethod {
    @Override
    public PersonalSpital createPersonal(String nume) {
        return new Medic(nume);
    }
}

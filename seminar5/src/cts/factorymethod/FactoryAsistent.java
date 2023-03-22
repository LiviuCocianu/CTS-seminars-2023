package cts.factorymethod;

import cts.personalspital.Asistent;
import cts.personalspital.Medic;
import cts.personalspital.PersonalSpital;

public class FactoryAsistent implements FactoryMethod {
    @Override
    public PersonalSpital createPersonal(String nume) {
        return new Asistent(nume);
    }
}

package cts.factorymethod;

import cts.personalspital.Asistent;
import cts.personalspital.Brancardier;
import cts.personalspital.PersonalSpital;

public class FactoryBrancardier implements FactoryMethod {
    @Override
    public PersonalSpital createPersonal(String nume) {
        return new Brancardier(nume);
    }
}

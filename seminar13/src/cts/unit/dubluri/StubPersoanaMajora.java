package cts.unit.dubluri;

import cts.unit.clase.IPersoana;

public class StubPersoanaMajora implements IPersoana {
    @Override
    public String getSex() {
        return "M";
    }

    @Override
    public int getVarsta() {
        return 18;
    }

    @Override
    public boolean checkCNP() {
        return true;
    }
}

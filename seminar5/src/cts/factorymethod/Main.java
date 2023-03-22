package cts.factorymethod;

public class Main {
    public static void main(String[] args) {
        FactoryMedic fmedic = new FactoryMedic();
        FactoryBrancardier fbran = new FactoryBrancardier();

        fmedic.createPersonal("Gigel").afisareDescriere();
        fbran.createPersonal("Maria").afisareDescriere();
        fmedic.createPersonal("Dorina").afisareDescriere();
    }
}

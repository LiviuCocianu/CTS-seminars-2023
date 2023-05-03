package cts.composite.clase;

public interface UnitateBancara {
    void adaugaUnitate(UnitateBancara unitate);
    void stergeUnitate(UnitateBancara unitate);
    UnitateBancara getUnitate(int index);
    void printDescriere(String identare);
}

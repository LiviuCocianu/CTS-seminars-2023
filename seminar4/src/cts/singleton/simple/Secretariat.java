package cts.singleton.simple;

public class Secretariat {
    private int numarBirou;
    private int numarAngajati;

    private static Secretariat instance;

    private Secretariat() {

    }

    private Secretariat(int numarBirou, int numarAngajati) {
        this.numarBirou = numarBirou;
        this.numarAngajati = numarAngajati;
    }

    public synchronized static Secretariat getInstance(int numarBirou, int numarAngajati) {
        if(instance == null) {
            instance = new Secretariat(numarBirou, numarAngajati);
        }

        return instance;
    }

    public synchronized static Secretariat getInstance() {
        if(instance == null) {
            instance = new Secretariat();
        }

        return instance;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Secretariat{");
        sb.append("numarBirou=").append(numarBirou);
        sb.append(", numarAngajati=").append(numarAngajati);
        sb.append('}');
        return sb.toString();
    }
}

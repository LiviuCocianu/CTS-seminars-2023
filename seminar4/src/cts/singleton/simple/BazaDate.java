package cts.singleton.simple;

public class BazaDate {
    private int dimDate;
    private int numarTabele;
    private String denumire;

    private static final BazaDate instance = new BazaDate(0, 0, "unknown");

    private BazaDate() {

    }

    private BazaDate(int dimDate, int numarTabele, String denumire) {
        this.dimDate = dimDate;
        this.numarTabele = numarTabele;
        this.denumire = denumire;
    }

    public static BazaDate getInstance() {
        return BazaDate.instance;
    }

    public void setDimensiuneDate(int dimDate) {
        this.dimDate = dimDate;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BazaDate{");
        sb.append("dimDate=").append(dimDate);
        sb.append(", numarTabele=").append(numarTabele);
        sb.append(", denumire='").append(denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

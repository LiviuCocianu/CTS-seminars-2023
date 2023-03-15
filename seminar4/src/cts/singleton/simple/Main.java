package cts.singleton.simple;

public class Main {
    public static void main(String[] args) {
        Secretariat secretariat = Secretariat.getInstance(1, 10);
        Secretariat secretariat2 = Secretariat.getInstance();

        System.out.println(secretariat);
        System.out.println(secretariat2);

        BazaDate bd = BazaDate.getInstance();
        BazaDate bd2 = BazaDate.getInstance();

        System.out.println(bd);
        System.out.println(bd2);

        bd.setDimensiuneDate(10);
        bd.setDimensiuneDate(20);

        System.out.println(bd);
        System.out.println(bd2);
    }
}

package cts.singleton.registry;

public class Main {
    public static void main(String[] args) {
        InstitutiePublica politie = InstitutiePublica.getInstance("Politie");
        InstitutiePublica pompieri = InstitutiePublica.getInstance("Pompieri");
        InstitutiePublica politieLocala = InstitutiePublica.getInstance("Politie");

        politieLocala.setNumarAngajati(10);

        System.out.println(politie);
        System.out.println(pompieri);
        System.out.println(politieLocala);
    }
}

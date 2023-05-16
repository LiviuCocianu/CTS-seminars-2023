package cts.adapter.main;

import cts.adapter.clase.AdapterRestaurant;
import cts.adapter.clase.ISoftBar;
import cts.adapter.clase.ISoftRestaurant;
import cts.adapter.clase.SoftBar;
import cts.adapter.clase.AdapterObiecteRestaurant;

public class Main {
    public static void imprimare(ISoftRestaurant restaurant, double totalNota) {
        restaurant.printeazaNota(totalNota);
    }

    public static void main(String[] args) {
        ISoftBar bar = new SoftBar("Alcadibo");
        bar.printeazaListaBautara(240);

        //Main.imprimare(bar,300);

        AdapterRestaurant adapterRestaurant = new AdapterRestaurant("Alcadibo");
        Main.imprimare(adapterRestaurant, 450);

        AdapterObiecteRestaurant adapterObiecteRestaurant = new AdapterObiecteRestaurant(bar);
        Main.imprimare(adapterObiecteRestaurant, 300);
    }
}
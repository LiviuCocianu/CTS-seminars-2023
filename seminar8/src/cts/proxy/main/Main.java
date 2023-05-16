package cts.proxy.main;

import cts.proxy.clase.IRestaurant;
import cts.proxy.clase.Proxy;
import cts.proxy.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        IRestaurant restaurant = new Restaurant(" La Fratii dei");
        restaurant.rezervaMasa(4);

        IRestaurant proxy = new Proxy(restaurant);
        proxy.rezervaMasa(3);
        System.out.println();
        proxy.rezervaMasa(5);
    }
}

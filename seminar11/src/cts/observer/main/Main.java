package cts.observer.main;

import cts.observer.clase.Client;
import cts.observer.clase.IClient;
import cts.observer.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        IClient client1 = new Client("George");
        IClient client2 = new Client("Stefan");
        IClient client3 = new Client("Victor");

        Restaurant restaurant = new Restaurant("Tratoria Monza");

        restaurant.introduOfertaNoua();

        restaurant.abonareClient(client1);

        restaurant.adaugaDiscount(25);

        restaurant.abonareClient(client2);
        restaurant.abonareClient(client3);
        restaurant.dezabonareClient(client1);

        restaurant.introduOfertaNoua();
    }
}

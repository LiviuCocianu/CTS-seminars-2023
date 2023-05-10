package cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant {
    private final String nume;
    private final List<IClient> clienti;

    public Restaurant(String nume) {
        this.nume = nume;
        this.clienti = new ArrayList<>();
    }

    @Override
    public void abonareClient(IClient client) {
        this.clienti.add(client);
    }

    @Override
    public void dezabonareClient(IClient client) {
        this.clienti.remove(client);
    }

    @Override
    public void notificareClienti(String mesaj) {
        this.clienti.forEach(cl -> cl.primesteNotificare(mesaj));
    }

    public void introduOfertaNoua() {
        notificareClienti(this.nume + " a introdus o oferta noua!");
    }

    public void adaugaDiscount(int discount) {
        notificareClienti(this.nume + " a adaugat un discount de " + discount + "%!");
    }
}

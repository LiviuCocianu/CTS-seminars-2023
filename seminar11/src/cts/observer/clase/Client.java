package cts.observer.clase;

public class Client implements IClient {
    private final String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(this.nume + ", ai o notificare noua:");
        System.out.println(mesaj);
        System.out.println();
    }
}

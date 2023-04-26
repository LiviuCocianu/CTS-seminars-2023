package cts.facade.clase;

public class Facade {
    private final Medic medic;
    private final Salon salon;

    public Facade() {
        this.medic = new Medic();
        this.salon = new Salon();

        this.medic.adaugaPacient(new Pacient("Costel", 5));
        this.medic.adaugaPacient(new Pacient("Gigel", 3));

        this.salon.adaugaPatLiber(1);
        this.salon.adaugaPatLiber(2);
        this.salon.adaugaPatLiber(3);
    }

    public void interneaza(String nume) {
        final Pacient pacient = this.medic.getPacient(nume);

        if(!this.medic.verificaTrimitere(pacient)) {
            System.out.println("Pacientul nu are trimitere de la medic");
            return;
        }

        if(this.salon.verificaPaturiLibere()) {
            if(pacient.getGravitate() > 4) {
                this.salon.ocupaPat(pacient);
                System.out.println("Pacientul cu numele '" + pacient.getNume() + "' a fost internat!");
            } else {
                System.out.println("Situatia pacientului nu este suficient de grava");
            }
        }
    }
}

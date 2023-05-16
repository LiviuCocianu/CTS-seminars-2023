package cts.command.main;

import cts.command.clase.Autobuz;
import cts.command.clase.CommandPlecareCursa;
import cts.command.clase.ManagerComenzi;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(1);
        ManagerComenzi managerComenzi = new ManagerComenzi();

        //autobuz.plecareInCursa(2);
        managerComenzi.invocaComanda(new CommandPlecareCursa(10, new Autobuz(1)));
        managerComenzi.invocaComanda(new CommandPlecareCursa(3, autobuz));

        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
    }
}

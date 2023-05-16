package cts.command.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
    private final List<ICommand> comenzi = new ArrayList<>();

    public void invocaComanda(ICommand command) {
        comenzi.add(command);
    }

    public void executaComanda() {
        if (comenzi.size() != 0) {
            this.comenzi.get(0).executa();
            this.comenzi.remove(this.comenzi.get(0));
        }
    }
}

package cts.strategy.main;

import cts.strategy.clase.Operator;
import cts.strategy.clase.VerificarePJ;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();

        operator.verifica();

        operator.setModVerificare(new VerificarePJ());

        operator.verifica();
    }
}

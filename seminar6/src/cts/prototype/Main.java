package cts.prototype;

import cts.prototype.clase.ContBancar;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        final Map<String, Integer> documente = new HashMap<>();
        documente.put("CI", 2);
        documente.put("Adeverinta", 6);

        final ContBancar cb = new ContBancar("Andrei", documente, 8);
        final ContBancar cb2 = (ContBancar) cb.cloneaza();

        System.out.println(cb == cb2);
        System.out.println(cb);
        System.out.println(cb2);
    }
}

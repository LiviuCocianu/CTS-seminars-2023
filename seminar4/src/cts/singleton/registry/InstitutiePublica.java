package cts.singleton.registry;

import java.util.HashMap;
import java.util.Map;

public class InstitutiePublica {
    private String denumire;
    private int numarAngajati;

    private static final Map<String, InstitutiePublica> registruInstitutii = new HashMap<>();

    private InstitutiePublica() {

    }

    private InstitutiePublica(String denumire, int numarAngajati) {
        this.denumire = denumire;
        this.numarAngajati = numarAngajati;
    }

    public synchronized static InstitutiePublica getInstance(String denumire) {
        if(!registruInstitutii.containsKey(denumire)) {
            registruInstitutii.put(denumire, new InstitutiePublica(denumire, 0));
        }

        return registruInstitutii.get(denumire);
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("InstitutiePublica{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", numarAngajati=").append(numarAngajati);
        sb.append('}');
        return sb.toString();
    }
}

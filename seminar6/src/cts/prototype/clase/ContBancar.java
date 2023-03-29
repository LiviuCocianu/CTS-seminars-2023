package cts.prototype.clase;

import java.util.HashMap;
import java.util.Map;

public class ContBancar implements IContCloneable {
    private String detinator;
    private Map<String, Integer> documente;
    private int numarFileDosar;

    public ContBancar(String detinator, Map<String, Integer> documente, int numarFileDosar) {
        int suma = documente.values().stream().reduce(0, Integer::sum);

        if(suma == numarFileDosar) {
            this.detinator = detinator;
            this.documente = documente;
            this.numarFileDosar = numarFileDosar;
        } else {
            throw new IllegalArgumentException("Numar incorect");
        }
    }

    private ContBancar() {
        this.documente = null;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ContBancar{");
        sb.append("detinator='").append(detinator).append('\'');
        sb.append(", documente=").append(documente);
        sb.append(", numarFileDosar=").append(numarFileDosar);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IContCloneable cloneaza() {
        final ContBancar cb = new ContBancar();

        cb.detinator = this.detinator;
        cb.numarFileDosar = this.numarFileDosar;
        cb.documente = new HashMap<>();

        for(String key : this.documente.keySet()) {
            cb.documente.put(key, this.documente.get(key));
        }

        return cb;
    }
}

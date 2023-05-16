package cts.adapter.clase;

public class AdapterObiecteRestaurant implements ISoftRestaurant {
    private final ISoftBar softBar;

    public AdapterObiecteRestaurant(ISoftBar softBar) {
        this.softBar = softBar;
    }

    @Override
    public void printeazaNota(double totalSuma) {
        this.softBar.printeazaListaBautara(totalSuma);
    }
}

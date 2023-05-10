package cts.state.clase;

public class StareRezervata implements IStare {
    @Override
    public void modificaStare(Masa masa) {
        if(masa.getStare() instanceof StareLibera) {
            System.out.println("Masa " + masa.getNumar() + " este acum rezervata!");
            masa.setStare(this);
        } else {
            System.out.println("Masa " + masa.getNumar() + " este deja rezervata..");
        }
    }
}

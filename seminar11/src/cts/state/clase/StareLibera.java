package cts.state.clase;

public class StareLibera implements IStare {
    @Override
    public void modificaStare(Masa masa) {
        if(!(masa.getStare() instanceof StareLibera)) {
            System.out.println("Masa " + masa.getNumar() + " este acum libera!");
            masa.setStare(this);
        } else {
            System.out.println("Masa " + masa.getNumar() + " este deja libera..");
        }
    }
}

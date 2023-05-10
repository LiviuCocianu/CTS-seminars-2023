package cts.state.clase;

public class StareOcupata implements IStare {
    @Override
    public void modificaStare(Masa masa) {
        if(!(masa.getStare() instanceof StareOcupata)) {
            System.out.println("Masa " + masa.getNumar() + " este acum ocupata!");
            masa.setStare(this);
        } else {
            System.out.println("Masa " + masa.getNumar() + " este deja ocupata..");
        }
    }
}

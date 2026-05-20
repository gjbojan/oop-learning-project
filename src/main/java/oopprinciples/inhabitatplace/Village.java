package inhabitatplace;

public class Village extends InhabitatPlace {
    boolean hasTradition;

    public Village(String name, int population, String major, boolean hasTradition) {
        super(name, population, major);
        this.hasTradition=hasTradition;
    }

    public Village() {

    }

    public void setHasTradition(boolean hasTradition) {
        this.hasTradition=hasTradition;
    }

    public boolean getHasTradition() {
        return hasTradition;
    }

    @Override
    public String drinkMilk() {
       return "Citizens from " + name + " drink homemade milk";
    }
}

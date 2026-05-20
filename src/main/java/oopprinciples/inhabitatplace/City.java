package inhabitatplace;

public class City extends InhabitatPlace {
    boolean isCapitalCity;
    int numberOfBoulevars;

    public City(String name, int population, String major, boolean isCapitalCity, int numberOfBoulevars) {
        super(name,population,major);
        this.isCapitalCity=isCapitalCity;
        this.numberOfBoulevars=numberOfBoulevars;
    }

    public City() {

    }

    public void setIsCapitalCity(boolean isCapitalCity) {
        this.isCapitalCity=isCapitalCity;
    }

    public void setNumberOfBoulevars(int numberOfBoulevars) {
        if(numberOfBoulevars < 1 || numberOfBoulevars > 200) {
            throw new IllegalArgumentException("The number of boulevards must be between 1 and 200 characters.");
        }
        this.numberOfBoulevars=numberOfBoulevars;
    }

    public boolean getIsCapitalCity() {
        return isCapitalCity;
    }

    public int getNumberOfBoulevars() {
        return numberOfBoulevars;
    }

    @Override
    public String drinkMilk() {
        return "Citizens from " + name + " mostly drink factory milk";
    }

}

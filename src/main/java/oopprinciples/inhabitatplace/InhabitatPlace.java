package inhabitatplace;

public abstract class InhabitatPlace {
    String name, major;
    int population;

    public InhabitatPlace(String name, int population, String major) {
        this.name=name;
        this.population=population;
        this.major=major;
    }

    public InhabitatPlace() {

    }

    public void setName(String name) {
        if(name == null) {
            throw new NullPointerException("The name cannot be null.");
        }
        if(name.trim().isEmpty() || name.length() > 25) {
            throw new IllegalArgumentException("The name must be between 1 and 25 characters.");
        }
        this.name=name;
    }

    public void setPopulation(int population) {
        if(population < 1) {
            throw new IllegalArgumentException("The population must not be lower than 1.");
        }
        this.population=population;
    }

    public void setMajor(String major) {
        if(major == null || major.trim().isEmpty() || major.length() > 25) {
            throw new IllegalArgumentException("The major name must be between 1 and 25 characters.");
        }
        this.major=major;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public String getMajor() {
        return major;
    }

    public String drinkMilk() {
       return "People from the inhabited place drink milk";
    }
}

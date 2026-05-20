package buildings;

public abstract class Building {
    double squareMeters;
    int numberOfRooms;
    int numberOfTerraces;
    boolean hasAlarms;

    public Building(double squareMeters, int numberOfRooms, int numberOfTerraces, boolean hasAlarms) {
        this.squareMeters=squareMeters;
        this.numberOfRooms=numberOfRooms;
        this.numberOfTerraces=numberOfTerraces;
        this.hasAlarms=hasAlarms;
    }

    public Building() {

    }

    public void setSquareMeters(double squareMeters) {
        if(squareMeters<1) {
            throw new IllegalArgumentException("The squareMeters value must not be less than 1.");
        }
        this.squareMeters=squareMeters;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        if(numberOfRooms < 1 || numberOfRooms > 50) {
            throw new IllegalArgumentException("The number of rooms must be between 1 and 50.");
        }
        this.numberOfRooms=numberOfRooms;
    }

    public void setNumberOfTerraces(int numberOfTerraces) {
        if(numberOfTerraces < 0 || numberOfTerraces > 10) {
            throw new IllegalArgumentException("The number of terraces must be between 1 and 10.");
        }
        this.numberOfTerraces=numberOfTerraces;
    }

    public void setHasAlarms(boolean hasAlarms) {
        this.hasAlarms=hasAlarms;
    }

    public double getSquareMeters() {
        return squareMeters;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfTerraces() {
        return numberOfTerraces;
    }

    public boolean getHasAlarms() {
        return hasAlarms;
    }

    public String buildingTime() {
        return "Building process time of the apartment or house";
    }
}

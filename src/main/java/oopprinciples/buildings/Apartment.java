package buildings;

public class Apartment extends Building {
    int floor;

    public Apartment(double squareMeters, int numberOfRooms, int numberOfTerraces, boolean hasAlarams, int floor) {
        super(squareMeters,numberOfRooms,numberOfTerraces,hasAlarams);
        this.floor=floor;
    }

    public Apartment() {

    }

    public void setFloor(int floor) {
        if(floor < 1 || floor > 200) {
            throw new IllegalArgumentException("The floor levels must be between 1 and 200.");
        }
        this.floor=floor;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public String buildingTime() {
        return "Building process time of the apartment is estimated to be around 1 and a half years.";
    }
}

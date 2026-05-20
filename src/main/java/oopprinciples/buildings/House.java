package buildings;

public class House extends Building {
    double yardSquareMeters;

    public House(double squareMeters, int numberOfRooms, int numberOfTerraces, boolean hasAlarm, double yardSquareMeters) {
        super(squareMeters,numberOfRooms,numberOfTerraces,hasAlarm);
        this.yardSquareMeters=yardSquareMeters;
    }

    public House() {

    }

    public void setYardSquareMeters(double yardSquareMeters) {
        if(yardSquareMeters < 1) {
            throw new IllegalArgumentException("The yard square meters value must not be less than 1.");
        }
        this.yardSquareMeters=yardSquareMeters;
    }

    public double getYardSquareMeters() {
        return yardSquareMeters;
    }

    @Override
    public String buildingTime() {
        return "Building process time of the house is estimated to be around 8 months.";
    }
}

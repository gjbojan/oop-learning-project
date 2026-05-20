package electronicdevices;

public class Smartphone extends ElectronicDevice {
    int numOfSimCards;

    public Smartphone(String brand, String model, String color, String currency, double price, int numOfSimCards) {
        super(brand,model,color,currency,price);
        this.numOfSimCards=numOfSimCards;
    }

    public Smartphone() {

    }

    public void setNumOfSimCards(int numOfSimCards) {
        if(numOfSimCards < 1 || numOfSimCards > 4) {
            throw new IllegalArgumentException("Number of SIM cards must be between 1 and 4.");
        }
        this.numOfSimCards=numOfSimCards;
    }

    public int getNumOfSimCards() {
        return numOfSimCards;
    }

    @Override
    public String printUnlockingDevice() {
        return "The smartphone device " + brand + " " + model + " is unlocked.";
    }
}

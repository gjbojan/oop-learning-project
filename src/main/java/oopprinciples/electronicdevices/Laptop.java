package electronicdevices;

public class Laptop extends ElectronicDevice {
    boolean hasCDRom;
    boolean hasNumpad;

    public Laptop(String brand, String model, String color, String currency, double price, boolean hasCDRom, boolean hasNumpad) {
        super(brand,model,color,currency,price);
        this.hasCDRom=hasCDRom;
        this.hasNumpad=hasNumpad;
    }

    public Laptop() {

    }

    public void setHasCDRom(boolean hasCDRom) {
        this.hasCDRom=hasCDRom;
    }

    public void setHasNumpad(boolean hasNumpad) {
        this.hasNumpad=hasNumpad;
    }

    public boolean getHasCDRom() {
        return hasCDRom;
    }

    public boolean getHasNumpad() {
        return hasNumpad;
    }

    @Override
    public String printUnlockingDevice() {
        return "The laptop device " + brand + " " + model + " is unlocked.";
    }
}

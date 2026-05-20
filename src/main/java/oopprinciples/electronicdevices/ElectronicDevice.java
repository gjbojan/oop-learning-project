package electronicdevices;

public abstract class ElectronicDevice {
    String brand, model, color;
    String currency;
    double price;

    public ElectronicDevice(String brand, String model, String color, String currency, double price) {
        this.brand=brand;
        this.model=model;
        this.color=color;
        this.price=price;
        this.currency=currency;
    }

    public ElectronicDevice() {

    }

    public void setBrand(String brand) {
        if(brand == null) {
            throw new NullPointerException("Brand cannot be null.");
        }

        if(brand.trim().isEmpty() || brand.length() > 25) {
            throw new IllegalArgumentException("The brand name must be between 1 and 25 characters.");
        }

        this.brand=brand;
    }

    public void setModel(String model) {
        if(model == null || model.trim().isEmpty() || model.length() > 25) {
            throw new IllegalArgumentException("The model must be between 1 and 25 characters.");
        }
        this.model=model;
    }

    public void setColor(String color) {
        if(color == null || color.trim().isEmpty() || color.length() > 25) {
            throw new IllegalArgumentException("The color must be between 1 and 25 characters.");
        }
        this.color=color;
    }

    public void setPrice(double price) {
        if(price < 0) {
            throw new IllegalArgumentException("The price must not be lower than 0.");
        }
        this.price=price;
    }

    public void setCurrency(String currency) {
        if(currency == null || currency.trim().isEmpty() || currency.length() > 10) {
            throw new IllegalArgumentException("The currency must be between 1 and 10 characters.");
        }
        this.currency=currency.toUpperCase();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    public String getFullPrice() {
        return price + " " + currency;
    }

    public String printUnlockingDevice() {
        return "The electronic device is unlocked.";
    }
}

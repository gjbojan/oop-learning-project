package animal;

public class Dog extends Animal {
    boolean isTrained;

    public Dog(int age, String color, String name, String type, boolean isTrained) {
        super(age,color,name,type);
        this.isTrained = isTrained;
    }

    public Dog() {

    }

    public void setIsTrained(boolean isTrained) {
        this.isTrained = isTrained;
    }

    public boolean getIsTrained() {
        return isTrained;
    }

    public String eat() {
        return "The dog " + name + " is eating.";
    }

}

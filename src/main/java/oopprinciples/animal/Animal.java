package animal;

public abstract class Animal {
    int age;
    String color, name, type;

    public Animal(int age, String color, String name, String type) {
        this.age = age;
        this.color = color;
        this.name = name;
        this.type = type;
    }

    public Animal() {

    }

    public void setAge(int age) {
        if(age < 1 || age > 125) {
            throw new IllegalArgumentException("Age must be between 1 and 125.");
        }
        this.age = age;
    }

    public void setColor(String color) {
        if(color == null || color.trim().isEmpty() || color.length() > 25) {
            throw new IllegalArgumentException("The color must be between 1 and 25 characters.");
        }
        this.color=color;
    }

    public void setName(String name) {
        if(name == null) {
            throw new NullPointerException("Name cannot be null.");
        }
        if(name.trim().isEmpty() || name.length() > 25) {
            throw new IllegalArgumentException("The name must be between 1 and 25 characters.");
        }
        this.name=name;
    }

    public void setType(String type) {
        if(type == null || type.trim().isEmpty() || type.length() > 25) {
            throw new IllegalArgumentException("The type must be between 1 and 25 characters.");
        }
        this.type=type;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String eat() {
        return "The animal is eating";
    }
}

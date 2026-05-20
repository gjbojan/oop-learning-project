package personstudent;

public class Person {
    String name, surname, gender;
    int age;

    public Person(String name, String surname, int age, String gender) {
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.gender=gender;
    }

    public Person() {

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

    public void setSurname(String surname) {
        if(surname == null) {
            throw new NullPointerException("The surname cannot be null.");
        }
        if(surname.trim().isEmpty() || surname.length() > 25) {
            throw new IllegalArgumentException("The surname must be between 1 and 25 characters.");
        }
        this.surname=surname;
    }

    public void setAge(int age) {
        if(age < 1 || age > 125) {
            throw new IllegalArgumentException("The age must be between 1 and 125.");
        }
        this.age=age;
    }

    public void setGender(String gender) {
        if(gender == null || gender.trim().isEmpty() || gender.length() > 25) {
            throw new IllegalArgumentException("The gender must be between 1 and 25 characters.");
        }
        this.gender=gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}

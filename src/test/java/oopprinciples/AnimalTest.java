package oopprinciples;

import animal.Bird;
import animal.Dog;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AnimalTest {

    Bird bird1 = new Bird(10, "yellow", "Suki", "nimf parrot", "rounded");
    Bird bird2 = new Bird();

    @Test
    public void BirdTests() {
        assertEquals(10, bird1.getAge());
        assertEquals("yellow", bird1.getColor());
        assertEquals("Suki", bird1.getName());
        assertEquals("nimf parrot", bird1.getType());
        assertEquals("rounded", bird1.getBeakType());

        bird2.setAge(5);
        bird2.setColor("red");
        bird2.setName("Moli");
        bird2.setType("riko");
        bird2.setBeakType("rounded");

        assertEquals(5, bird2.getAge());
        assertEquals("red", bird2.getColor());
        assertEquals("Moli", bird2.getName());
        assertEquals("riko", bird2.getType());
        assertEquals("rounded", bird2.getBeakType());

        System.out.println(bird1.eat());
    }

    @Test
    public void DogTests() {
        Dog dog1 = new Dog(2, "yellow", "Jack", "Akita", true);
        Dog dog2 = new Dog();

        assertEquals(2, dog1.getAge());
        assertEquals("yellow", dog1.getColor());
        assertEquals("Jack", dog1.getName());
        assertEquals("Akita", dog1.getType());
        assertTrue(dog1.getIsTrained());

        dog2.setAge(7);
        dog2.setColor("yellow");
        dog2.setName("Hacko");
        dog2.setType("Akita");
        dog2.setIsTrained(true);

        assertEquals(7, dog2.getAge());
        assertEquals("yellow", dog2.getColor());
        assertEquals("Hacko", dog2.getName());
        assertEquals("Akita", dog2.getType());
        assertTrue(dog2.getIsTrained());

        System.out.println(dog1.eat());
        System.out.println(dog2.eat());

    }
}

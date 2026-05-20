package wrapperclassesandcollections;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;

public class ArrayListExample {

    @Test
    public void arrayListTest() {
        ArrayList<String> programmingLanguages = new ArrayList<>();
        ArrayList<String> emptyList = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("C++");

        for(int i=0; i<programmingLanguages.size(); i++) {
            System.out.println(programmingLanguages.get(i));
        }

        System.out.println("------------");
        programmingLanguages.add(1, "Javascript");

        for(int i=0; i<programmingLanguages.size(); i++) {
            System.out.println(programmingLanguages.get(i));
        }

        System.out.println("------------------------");
        System.out.println("Element of index 1: " + programmingLanguages.get(1));
        System.out.println("Index of element javascript: " + programmingLanguages.indexOf("Javascript"));

        System.out.println("------------");

        programmingLanguages.set(3, "C#");

        for(int i=0; i<programmingLanguages.size(); i++) {
            System.out.println(programmingLanguages.get(i));
        }

        System.out.println("------------");

        System.out.println("Size before removal: " + programmingLanguages.size());
        programmingLanguages.remove(0);
        //programmingLanguages.remove("Java");
        System.out.println("Size after removal: " + programmingLanguages.size());

        System.out.println("------------------------------------");

        System.out.println("Is programming languages list empty? - " + programmingLanguages.isEmpty());
        System.out.println("Is this list empty? - " + emptyList.isEmpty());

        System.out.println("----------------------------------------------------");

        System.out.println("Does programming language Java exist in the list? - " + programmingLanguages.contains("Java"));

    }
}

//Напишете програма, която създава колекция от тип Double и инициализира всеки от елементите със стойност равна на индекса на елемента умножен по 3.
//Да се изведат елементите на екрана.

import java.util.*;

public class myCollection {
    public static void main(String[] args){
        List<Double> specialCollection = new ArrayList<>();

        // Initialize collection with multiples of 3
        for (int i = 0; i < 10; i++) {
            specialCollection.add(i * 3.0);
        }

        // Display the collection
        System.out.println("Collection of multiples of 3 (Double): " + specialCollection);





    }
}

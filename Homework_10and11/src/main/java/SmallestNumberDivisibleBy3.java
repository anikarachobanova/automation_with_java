import java.util.*;
//Да се прочете колекция от екрана(Scanner) и да се намери най-малкото
//число кратно на 3 от колекцията.
//Ако няма такова число, да се изведе подходящо съобщение.
public class SmallestNumberDivisibleBy3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter numbers (type 'done' to finish):");
        //Read numbers from the console until 'done' is entered
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }

        int smallestNumberDivisibleBy3 = -1; //No valid result found initially (is that ok?)
        // Find the smallest number divisible by 3
        for (int number : numbers) {
            if (number % 3 == 0) {
                if (smallestNumberDivisibleBy3 == -1 || number < smallestNumberDivisibleBy3) {
                    smallestNumberDivisibleBy3 = number;
                }
            }
        }

        // Output result
        if (smallestNumberDivisibleBy3 != -1) {
            System.out.println("The smallest number divisible by 3 is " + smallestNumberDivisibleBy3);
        } else {
            System.out.println("There is no number divisible by 3 in the collection.");
        }





    }

}

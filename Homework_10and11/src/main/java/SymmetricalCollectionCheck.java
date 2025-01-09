import java.util.*;
//Да се прочете колекция от екрана(Scanner) и да се провери дали е огледална.

public class SymmetricalCollectionCheck {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter numbers (type 'done' to finish):");

        // Read numbers from the console
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }

        // Check if the collection is symmetrical
        boolean isSymmetrical = true;
        int size = numbers.size();
        for (int i = 0; i < size / 2; i++) {
            if (!numbers.get(i).equals(numbers.get(size - i - 1))) {
                isSymmetrical = false;
                break;
            }
        }

        // Output result
        if (isSymmetrical) {
            System.out.println("The collection is symmetrical.");
        } else {
            System.out.println("The collection is not symmetrical.");
        }
    }
        
        
    }

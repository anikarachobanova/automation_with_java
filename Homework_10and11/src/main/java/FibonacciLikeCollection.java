import java.util.*;
//Да се въведе число от конзолата(Scanner), след което да се създаде колекция,
//в която като краен резултат да има 10 елемента по следния начин:
//Първите 2 елемента на колекцията са въведеното число.
//Всеки следващ елемент на колекцията е равен на сбора от предишните 2 елемента в колекцията.
//След това изведете колекцията на козолата.

public class FibonacciLikeCollection {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Integer> collection = new ArrayList<>();

        // Input the first two elements
        System.out.print("Enter the 1st element: ");
        int firstElement = scanner.nextInt();
        collection.add(firstElement);

        System.out.print("Enter the 2nd element: ");
        int secondElement = scanner.nextInt();
        collection.add(secondElement);

        // Generate the next 8 elements
        for (int i = 2; i < 10; i++) {
            int nextElement = collection.get(i - 1) + collection.get(i - 2);
            collection.add(nextElement);
        }

        // Display the collection
        System.out.println("Generated Collection: " + collection);
    }
}

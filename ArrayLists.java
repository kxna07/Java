import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        // Create an ArrayList to store food items
        ArrayList<String> food = new ArrayList<>();

        // Add elements to the ArrayList
        food.add("pizza");
        food.add("hamburger");
        food.add("pasta");
        
        // Print the list after adding elements
        System.out.println("After adding elements: " + food);

        // Retrieve and print the first element of the list
        String firstFoodString = food.get(0); // Access the element at index 0
        System.out.println("First element: " + firstFoodString);

        // Modify an element in the ArrayList
        food.set(2, "sushi"); // Replace the element at index 2 with "sushi"
        System.out.println("After modifying elements: " + food);

        // Remove an element by its index
        food.remove(1); // Remove the element at index 1 ("hamburger")
        System.out.println("After removing element: " + food);
    }
}


import java.util.ArrayList;

public class HD {
    public static void main(String[] args) {
        // Heap-dynamic array (ArrayList)
        ArrayList<Integer> arr = new ArrayList<>();
        
        // Add elements dynamically
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(1, 15); // Insert at index 1
        
        System.out.println("\nHeap-Dynamic Array (ArrayList):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        // Remove element
        arr.remove(2);
        
        System.out.println("\nAfter removal:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

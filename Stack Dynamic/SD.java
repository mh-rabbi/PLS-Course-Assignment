//Java doesn't have true stack-dynamic arrays like C/C++, but we can simulate with method-local arrays
// This code demonstrates stack-dynamic behavior by allocating arrays within method scope
// and reusing the same memory location for different sizes in subsequent calls.
public class SD {
    public static void main(String[] args) {
        // Simulating stack-dynamic behavior with method call
        processArray(5);
        processArray(10); // Different size in same memory location
    }
    
    public static void processArray(int size) {
        int[] arr = new int[size]; // Allocated on stack for method call
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 10; // Assign values to the array
        }
        
        System.out.println("\nStack-Dynamic Array (size " + size + "):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}

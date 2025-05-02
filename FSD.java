public class FSD {
    public static void main(String[] args) {
        // Fixed stack-dynamic array
        int[] arr = new int[5]; // Size fixed at declaration
        
        // Initialize array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 10; // Assign values to the array
        }
        
        // Print array
        System.out.println("Fixed Stack-Dynamic Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}

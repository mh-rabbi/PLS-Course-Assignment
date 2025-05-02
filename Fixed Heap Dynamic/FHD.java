
public class FHD {
    public static void main(String[] args) {
        // Fixed heap-dynamic array (standard Java array)
        int[] arr = new int[7]; // Allocated on heap, size fixed after creation
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 5;
        }
        
        System.out.println("\nFixed Heap-Dynamic Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

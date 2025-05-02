
### 1. Class Declaration
```java
public class SD {
```
- Defines a public class named `SD` (must match the filename `SD.java`)

### 2. Main Method (Entry Point)
```java
public static void main(String[] args) {
    processArray(5);
    processArray(10); // Different size in same memory location
}
```
- The program's entry point
- Calls `processArray()` twice with different sizes (5 and 10)
- Demonstrates stack-dynamic behavior by creating arrays of different sizes

### 3. processArray Method
```java
public static void processArray(int size) {
    int[] arr = new int[size]; // Stack-dynamic allocation
```
- Takes a size parameter
- Creates a new array of the specified size
- Memory is allocated when the method is called (stack-dynamic)

### 4. Array Initialization
```java
for (int i = 0; i < arr.length; i++) {
    arr[i] = i * 10; // Assign values to the array
}
```
- Fills the array with values where each element = index × 10
- For size=5: [0, 10, 20, 30, 40]
- For size=10: [0, 10, 20, 30, 40, 50, 60, 70, 80, 90]

### 5. Output Generation
```java
System.out.println("\nStack-Dynamic Array (size " + size + "):");
for (int num : arr) {
    System.out.print(num + " ");
}
```
- Prints the array size header
- Uses enhanced for-loop to print each element

### Complete Output
When executed, this program will produce:
```

Stack-Dynamic Array (size 5):
0 10 20 30 40 

Stack-Dynamic Array (size 10):
0 10 20 30 40 50 60 70 80 90 
```

### Key Characteristics
1. **Stack-Dynamic Behavior**:
   - Array size determined at runtime
   - Memory allocated when method is called
   - Automatically freed when method exits

2. **Memory Efficiency**:
   - Same memory location reused for different array sizes
   - No memory wasted when smaller arrays are needed

3. **Type Safety**:
   - Fixed type (`int`) for all elements
   - Compile-time checking of array operations

4. **Performance**:
   - Stack allocation is faster than heap allocation
   - Good for temporary arrays in methods

### Visual Representation (for size=5)
```
Index: 0   1   2   3   4
Value:[0][10][20][30][40]
```

This implementation demonstrates how Java handles:
- Method-local array allocation
- Runtime size determination
- Automatic memory management for stack-allocated arrays
- Reuse of memory locations for different method calls
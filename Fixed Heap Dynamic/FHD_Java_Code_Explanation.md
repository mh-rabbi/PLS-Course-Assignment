
### Code Breakdown

1. **Class Declaration**
```java
public class FHD {
```
- Defines a public class named `FHD` (must be saved in `FHD.java` file)

2. **Main Method (Entry Point)**
```java
public static void main(String[] args) {
```
- Standard Java entry point for program execution

3. **Array Declaration & Allocation**
```java
    int[] arr = new int[7]; // Heap allocation
```
- Creates an integer array of fixed size 7
- Memory is allocated on the heap (not the stack)
- All elements initialized to 0 (default for `int`)

4. **Array Initialization**
```java
    for (int i = 0; i < arr.length; i++) {
        arr[i] = i * 5;
    }
```
- Fills the array with values where each element = index × 5
- Step-by-step execution:

| Index (i) | Calculation | Array State After Assignment |
|-----------|-------------|------------------------------|
| 0         | 0 × 5 = 0   | [0, 0, 0, 0, 0, 0, 0]        |
| 1         | 1 × 5 = 5   | [0, 5, 0, 0, 0, 0, 0]        |
| 2         | 2 × 5 = 10  | [0, 5, 10, 0, 0, 0, 0]       |
| 3         | 3 × 5 = 15  | [0, 5, 10, 15, 0, 0, 0]      |
| 4         | 4 × 5 = 20  | [0, 5, 10, 15, 20, 0, 0]     |
| 5         | 5 × 5 = 25  | [0, 5, 10, 15, 20, 25, 0]    |
| 6         | 6 × 5 = 30  | [0, 5, 10, 15, 20, 25, 30]   |

5. **Output Generation**
```java
    System.out.println("\nFixed Heap-Dynamic Array:");
    for (int num : arr) {
        System.out.print(num + " ");
    }
```
- Prints a header label
- Uses enhanced for-loop to print each element separated by spaces

### Final Output
```
Fixed Heap-Dynamic Array:
0 5 10 15 20 25 30 
```

### Key Characteristics

1. **Heap Allocation**:
   - The array is allocated on the heap (persists beyond method scope)
   - Contrasts with stack-dynamic arrays that are method-local

2. **Fixed Size**:
   - Size (7) is fixed after creation
   - Cannot be resized (unlike ArrayList)

3. **Type Safety**:
   - Can only contain integers (`int` type)
   - Compile-time type checking

4. **Memory Layout**:
   - Contiguous memory allocation
   - Direct index-based access (O(1) time complexity)

### Memory Representation
```
Index: 0   1   2   3   4   5   6
Value:[0][5][10][15][20][25][30]
```

### Compilation & Execution
1. Save as `FHD.java`
2. Compile: `javac FHD.java`
3. Run: `java FHD`

This demonstrates Java's basic fixed-size heap-allocated array, which is:
- Efficient for known-size collections
- Type-safe
- A fundamental building block for more complex data structures
- Used when you need the array to persist beyond method scope
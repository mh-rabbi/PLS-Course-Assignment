
## Code Breakdown

### 1. Array Declaration
```java
int[] arr = new int[5]; // Size fixed at declaration
```
- Creates an integer array with fixed size of 5 elements
- All elements are initialized to 0 (default for `int` in Java)
- Memory is allocated when the method is called (stack-dynamic)

### 2. Array Initialization
```java
for (int i = 0; i < arr.length; i++) {
    arr[i] = i * 10; // Assign values to the array
}
```
The loop fills the array with values:
- `i` ranges from 0 to 4 (since `arr.length` is 5)
- Each element is assigned the value of its index multiplied by 10

### Step-by-Step Execution:

| Iteration | i value | Calculation (i*10) | Array State After Assignment |
|-----------|---------|--------------------|------------------------------|
| 1         | 0       | 0*10 = 0            | [0, 0, 0, 0, 0]              |
| 2         | 1       | 1*10 = 10           | [0, 10, 0, 0, 0]             |
| 3         | 2       | 2*10 = 20           | [0, 10, 20, 0, 0]            |
| 4         | 3       | 3*10 = 30           | [0, 10, 20, 30, 0]           |
| 5         | 4       | 4*10 = 40           | [0, 10, 20, 30, 40]          |

### 3. Printing the Array
```java
System.out.println("Fixed Stack-Dynamic Array:");
for (int num : arr) {
    System.out.print(num + " ");
}
```
- First prints the label
- Then uses an enhanced for-loop to print each element
- The loop iterates through each value in `arr`

### Final Output
```
Fixed Stack-Dynamic Array:
0 10 20 30 40 
```

## Key Characteristics

1. **Fixed Size**: The array size (5) is determined at declaration and cannot change
2. **Stack-Dynamic**: Memory is allocated when the method executes
3. **Type-Safe**: Can only contain integers (`int`)
4. **Zero-Based Indexing**: First element is at index 0
5. **Sequential Storage**: Elements are stored contiguously in memory

## Memory Representation

```
Index:   0   1   2   3   4
Value: [0][10][20][30][40]
```

This demonstrates a classic fixed-size array implementation where:
- The size is known at compile time
- Memory is allocated when the method runs
- Elements are accessed via index
- All elements must be of the declared type (`int` in this case)
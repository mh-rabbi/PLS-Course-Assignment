
def stack_dynamic(size):
    # Stack-dynamic behavior
    arr = [0] * size  # Size determined at runtime
    
    for i in range(size):
        arr[i] = i * 10  # Assigning values to the array
    
    print(f"\nStack-Dynamic Array (size {size}):")
    print(arr)

stack_dynamic(4)
stack_dynamic(6)  # Different size
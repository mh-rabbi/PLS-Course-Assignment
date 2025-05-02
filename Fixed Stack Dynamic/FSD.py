#Python lists are dynamic by nature, but we can simulate fixed behavior

def fixed_stack_dynamic():
    # Simulating fixed stack-dynamic array
    arr = [0] * 5  # Fixed size allocation
    
    for i in range(len(arr)):
        arr[i] = i * 10  # Assigning values to the array
    
    print("Fixed Stack-Dynamic Array (simulated):")
    print(arr)

fixed_stack_dynamic()
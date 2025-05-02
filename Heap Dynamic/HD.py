def heap_dynamic():
    # Python's built-in list is heap-dynamic
    arr = []  # Empty list
    
    # Dynamic operations
    arr.append(10)
    arr.append(20)
    arr.append(30)
    arr.insert(1, 15)  # Insert at position 1
    
    print("\nHeap-Dynamic Array (Python list):")
    print(arr)
    
    # Remove element
    arr.pop(2)
    
    print("After removal:")
    print(arr)

heap_dynamic()
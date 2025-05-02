
def fixed_heap_dynamic():
    # Fixed heap-dynamic (Python array module provides fixed-type arrays)
    import array
    arr = array.array('i', [0, 0, 0, 0, 0])  # Fixed size, heap allocated
    
    for i in range(len(arr)):
        arr[i] = i * 5
    
    print("\nFixed Heap-Dynamic Array (array module):")
    print(arr.tolist())

fixed_heap_dynamic()
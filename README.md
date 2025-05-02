# Array Categories and Structural Comparison: Java vs Python

This repository demonstrates the implementation of four array categories in both Java and Python, highlighting the structural differences between the two languages.

## Array Categories
---
## 🔍 **1. Fixed Stack Dynamic Arrays**

### 📌 **Definition:**

Array size is **known at compile time**, and stored on the **stack**.

| Feature             | Java                               | Python                                       |
| ------------------- | ---------------------------------- | -------------------------------------------- |
| Allocation          | On the **stack** (primitive array) | **List** is actually **heap-allocated**      |
| Size change allowed | ❌ No (fixed size)                  | ✅ Technically can change (but not in intent) |
| True stack behavior | ✅ Yes                              | ❌ Python lists are heap structures           |

🔹 **Note:** Python does not use stack-allocated arrays like C/Java primitives. All objects in Python are heap-allocated by design.

---

## 🔍 **2. Stack Dynamic Arrays**

### 📌 **Definition:**

Size is decided **at run-time**, but the structure is created on the **stack**.

| Feature             | Java                                                  | Python                                  |
| ------------------- | ----------------------------------------------------- | --------------------------------------- |
| Allocation          | On stack (primitive arrays)                           | On heap (lists are objects)             |
| Size change allowed | ❌ No                                                  | ✅ Yes (Python lists are dynamic)        |
| True stack behavior | ✅ Yes                                                 | ❌ No (Python doesn’t allocate on stack) |

🔹 **Observation:** Java has real stack arrays; Python's list is always heap-allocated, even with a runtime size.

---

## 🔍 **3. Fixed Heap Dynamic Arrays**

### 📌 **Definition:**

Size is fixed **after allocation**, but allocated on the **heap**.

| Feature             | Java                                      | Python                                                 |
| ------------------- | ----------------------------------------- | ------------------------------------------------------ |
| Wrapper class usage | ✅ Yes (Integer class forces heap storage) | ✅ Yes (using `array` module mimics fixed-heap storage) |
| Size change allowed | ❌ No                                      | ❌ No (for array module)                                |

🔹 **Note:** Both languages can simulate fixed-size heap arrays, though in Python it's less common.

---

## 🔍 **4. Heap Dynamic Arrays**

### 📌 **Definition:**

Size is **not fixed**, can grow/shrink dynamically during execution.

| Feature             | Java                                          | Python                  |
| ------------------- | --------------------------------------------- | ----------------------- |
| Allocation          | Heap                                          | Heap                    |
| Size change allowed | ✅ Yes                                         | ✅ Yes                   |
| Dynamic behavior    | ✅ Full support via `ArrayList`                | ✅ Built-in dynamic list |

🔹 **Observation:** Both Java’s `ArrayList` and Python’s `list` are dynamic arrays implemented on the heap.

---

## ⚖️ **Summary Table**

| Category            | Java Example             | Python Example               | Size Fixed | Stack/Heap               | Resizable |
| ------------------- | ------------------------ | ---------------------------- | ---------- | ------------------------ | --------- |
| Fixed Stack Dynamic | `int[] arr = new int[5]` | `arr = [0]*5` (logical only) | Yes        | Stack (Java) / Heap (Py) | No        |
| Stack Dynamic       | `new int[size]`          | `[0]*size`                   | Yes        | Stack / Heap             | No        |
| Fixed Heap Dynamic  | `new Integer[5]`         | `array.array('i', ...)`      | Yes        | Heap                     | No        |
| Heap Dynamic        | `new ArrayList<>()`      | `[]`                         | No         | Heap                     | Yes       |

---

## Key Differences

1. **Default Behavior**:
   - Java arrays are fixed-size by default
   - Python lists are dynamic by default

2. **Memory Management**:
   - Java has explicit stack/heap allocation
   - Python abstracts memory management

3. **Type Flexibility**:
   - Java arrays are homogeneous
   - Python lists can hold mixed types

4. **Performance**:
   - Java arrays have better performance for fixed-size data
   - Python lists are optimized for dynamic operations

5. **Syntax**:
   - Java requires type declaration and `new` keyword
   - Python uses simple bracket notation

---

## 📝 How to Run

- **Java:** Compile and run each `.java` file using a Java compiler (JDK).
- **Python:** Execute `.py` scripts using Python 3 interpreter.

---


## Conclusion

While both languages support all four array categories, Java provides more explicit control over memory allocation and fixed-size structures, while Python emphasizes flexibility and ease of use with its built-in dynamic lists.


## 📚 Educational Use

This project is an assignment given by our Course instrutor Md.Nazir Ahmed Sir to help learners understand array allocation models and dynamic memory handling in modern programming languages.

Feel free to fork, modify, and explore further!

# Java Pattern Programs Collection 🌟

Welcome to this comprehensive collection of Java pattern programs! This repository contains various star patterns, number patterns, and geometric shapes implemented in Java.

## 📋 Table of Contents
- [Overview](#-overview)
- [Star Patterns](#-star-patterns)
- [Number Patterns](#-number-patterns)
- [Geometric Patterns](#-geometric-patterns)
- [How to Run](#-how-to-run)
- [Pattern Index](#-pattern-index)

## 🎯 Overview

This collection features 14 different pattern programs that demonstrate:
- Loop concepts and nested loops
- Pattern recognition and logic building
- Basic Java programming constructs
- Mathematical thinking for pattern generation

**✨ Code Quality Features:**
- Comprehensive JavaDoc comments for all classes and methods
- Well-structured code with meaningful variable names
- Detailed inline comments explaining logic
- Consistent formatting and indentation
- Educational examples in comments showing expected output

## ⭐ Star Patterns

### 1. Solid Rectangle
**File:** `solidrec.java`
**Pattern:**
```
*****
*****
*****
*****
```
**Description:** Creates a solid rectangle filled with stars.

### 2. Hollow Rectangle
**File:** `Hrectangle.java`
**Pattern:**
```
*****
*   *
*   *
*****
```
**Description:** Creates a hollow rectangle with stars only on the border.

### 3. Half Pyramid
**File:** `HalfPyramid.java`
**Pattern:**
```
*
**
***
****
```
**Description:** Creates a right-angled triangle pattern with increasing stars.

### 4. Inverted Half Pyramid
**File:** `inveretHP.java`
**Pattern:**
```
****
***
**
*
```
**Description:** Creates an inverted right-angled triangle pattern.

### 5. 180° Rotated Half Pyramid
**File:** `ifp180.java`
**Pattern:**
```
   *
  **
 ***
****
```
**Description:** Half pyramid rotated 180 degrees with leading spaces.

### 6. Pyramid/Triangle
**File:** `pyramid.java`
**Pattern:**
```
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
```
**Description:** Creates a centered pyramid with numbers.

### 7. Diamond Pattern
**File:** `Diamond.java`
**Pattern:**
```
  *
 * *
* * *
 * *
  *
```
**Description:** Creates a diamond shape with stars.

### 8. Rhombus Pattern
**File:** `rhombus.java`
**Pattern:**
```
    *****
   *****
  *****
 *****
*****
```
**Description:** Creates a rhombus/parallelogram shape.

### 9. Butterfly Pattern
**File:** `Butterfly.java`
**Pattern:**
```
*       * 
* *   * * 
* * * * * 
* *   * * 
*       * 
```
**Description:** Creates a symmetric butterfly wing pattern.

## 🔢 Number Patterns

### 10. Number Pyramid
**File:** `numPyramid.java`
**Pattern:**
```
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
```
**Description:** Pyramid with consecutive numbers starting from 1.

### 11. Inverted Number Pyramid
**File:** `InumPyramid.java`
**Pattern:**
```
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
```
**Description:** Inverted pyramid with consecutive numbers.

### 12. Floyd's Triangle
**File:** `Fylodtriangle.java`
**Pattern:**
```
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
```
**Description:** Triangle with consecutive numbers continuing across rows.

### 13. 0-1 Triangle Pattern
**File:** `Trinagle01.java`
**Pattern:**
```
1 
01 
101 
0101 
10101 
```
**Description:** Triangle pattern alternating between 0 and 1.

### 14. Palindromic Number Pyramid
**File:** `PalindromicNumberPyramid.java`
**Pattern:**
```
    1 
   212 
  32123 
 4321234 
543212345 
```
**Description:** Pyramid where each row forms a palindrome with numbers.

## 🚀 How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line terminal

### Compilation and Execution

1. **Compile a Java file:**
   ```bash
   javac FileName.java
   ```

2. **Run the compiled program:**
   ```bash
   java ClassName
   ```

### Example:
```bash
# Compile the Diamond pattern
javac Diamond.java

# Run the Diamond pattern
java Diamond
```

## 📊 Pattern Index

| Pattern Type | File Name | Difficulty | Description |
|-------------|-----------|------------|-------------|
| Rectangle | `solidrec.java` | ⭐ | Basic solid rectangle |
| Rectangle | `Hrectangle.java` | ⭐⭐ | Hollow rectangle with border |
| Triangle | `HalfPyramid.java` | ⭐ | Right-angled triangle |
| Triangle | `inveretHP.java` | ⭐ | Inverted right triangle |
| Triangle | `ifp180.java` | ⭐⭐ | 180° rotated triangle |
| Pyramid | `pyramid.java` | ⭐⭐ | Centered number pyramid |
| Diamond | `Diamond.java` | ⭐⭐⭐ | Diamond star pattern |
| Rhombus | `rhombus.java` | ⭐⭐ | Parallelogram shape |
| Butterfly | `Butterfly.java` | ⭐⭐⭐ | Symmetric butterfly wings |
| Numbers | `numPyramid.java` | ⭐⭐ | Consecutive number pyramid |
| Numbers | `InumPyramid.java` | ⭐⭐ | Inverted number pyramid |
| Numbers | `Fylodtriangle.java` | ⭐⭐ | Floyd's triangle sequence |
| Numbers | `Trinagle01.java` | ⭐⭐ | Binary alternating pattern |
| Numbers | `PalindromicNumberPyramid.java` | ⭐⭐⭐ | Palindromic number pyramid |

## 💡 Learning Tips

1. **Start with basic patterns** like solid rectangle and half pyramid
2. **Understand nested loops** - outer loop for rows, inner loop for columns
3. **Practice space calculations** for centered patterns like pyramids
4. **Trace through the logic** step by step for complex patterns
5. **Modify the size variable** to see how patterns scale
6. **Read the comments** - Each file has detailed explanations of the logic
7. **Experiment with values** - Change dimensions to understand the algorithms

## 🔧 Code Features

All Java files in this collection include:

### 📚 Documentation
- **JavaDoc headers** with pattern descriptions and examples
- **Inline comments** explaining each loop's purpose
- **Variable explanations** with clear naming conventions
- **Expected output examples** in comments

### 🎨 Code Quality
- **Consistent formatting** and proper indentation
- **Meaningful variable names** (e.g., `rows`, `columns`, `size`)
- **Clear loop structure** with descriptive comments
- **Optimized algorithms** for pattern generation

### 🧪 Educational Value
- **Step-by-step logic** explained in comments
- **Mathematical concepts** behind each pattern
- **Progressive difficulty** from simple to complex patterns
- **Best practices** for Java programming

## 🤝 Contributing

Feel free to:
- Add new pattern programs
- Optimize existing code
- Improve documentation
- Add more complex patterns

## 📝 Notes

- All programs use simple console output with clean formatting
- Pattern sizes can be modified by changing the dimension variables
- Each file is self-contained and can be run independently
- **Comprehensive comments** explain the logic and algorithm for each pattern
- **JavaDoc documentation** provides professional-style code documentation
- Code follows Java best practices and conventions
- Programs are beginner-friendly with clear, readable structure

---

**Happy Coding! 🎉**

*Practice these patterns to strengthen your loop concepts and logical thinking in Java programming.*
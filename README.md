# Numbered Right-Angle Triangle Pattern in Java

## Description
This Java program generates a right-angled triangle pattern of numbers based on user input. The user specifies the size of the triangle, and the program prints rows where each row starts from 1 and increments up to the row number.

## Code Implementation
```java
package number_patterns;

import java.util.Scanner;

public class Numbered_RightAngle_Triangle
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in); // Creating a Scanner object to take user input
        System.out.println("Enter the size"); // Prompt message for user input
        int n = s.nextInt(); // Reading an integer input from the user
        
        for(int i = 1; i <= n; i++) // Outer loop to handle the number of rows
        {
            int num = 1; // Initializing number for each row
            for(int j = 1; j <= i; j++) // Inner loop to print numbers in each row
            {
                System.out.print(num++); // Printing numbers in increasing order
            }
            System.out.println(); // Moving to the next line after printing numbers for a row
        }
    }
}
```

## Explanation of Code Components

### 1. **Package Declaration**
```java
package number_patterns;
```
- This line declares that the class belongs to the `number_patterns` package.
- Packages help organize related Java classes and avoid naming conflicts.

### 2. **Importing Scanner Class**
```java
import java.util.Scanner;
```
- The `Scanner` class is imported from the `java.util` package.
- It allows the program to take input from the user.

### 3. **Main Method**
```java
public static void main(String[] args)
```
- The `main` method is the entry point of the program.
- The execution starts from here.

### 4. **Creating a Scanner Object**
```java
Scanner s = new Scanner(System.in);
```
- `Scanner s` is an instance of the `Scanner` class.
- `System.in` indicates that input will be taken from the keyboard.

### 5. **Prompting User for Input**
```java
System.out.println("Enter the size");
```
- Displays a message asking the user to enter the size of the triangle.

### 6. **Reading User Input**
```java
int n = s.nextInt();
```
- `nextInt()` reads an integer value entered by the user and stores it in `n`.

### 7. **Outer for Loop (Handling Rows)**
```java
for(int i = 1; i <= n; i++)
```
- This loop runs `n` times, where `n` is the user input.
- Each iteration corresponds to one row in the triangle pattern.

### 8. **Initializing Number Variable**
```java
int num = 1;
```
- This initializes the number to be printed in each row.
- It resets to `1` at the beginning of each row.

### 9. **Inner for Loop (Printing Numbers in Each Row)**
```java
for(int j = 1; j <= i; j++)
```
- Controls the number of elements printed in each row.
- Runs `i` times for each row, printing numbers from `1` to `i`.

### 10. **Printing Numbers**
```java
System.out.print(num++);
```
- Prints the current value of `num`.
- `num++` increments the value for the next number.
- `print()` is used instead of `println()` to keep numbers in the same row.

### 11. **Moving to the Next Line**
```java
System.out.println();
```
- Moves the cursor to the next line after printing one row.
- Ensures each row starts on a new line.

## Example Output
```
Enter the size
5
1
12
123
1234
12345
```

## Summary
- The program takes an integer input from the user.
- It uses nested loops to print a right-angled triangle pattern.
- The outer loop controls the rows, while the inner loop prints numbers in increasing order.
- The `Scanner` class is used to handle user input.

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Numbered_RightAngle_Triangle.git
```

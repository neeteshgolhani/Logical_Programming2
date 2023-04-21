package com.bridgelabz;
import java.util.Scanner;
/*This code takes input from the user for the limit of the Fibonacci series to be generated,
 and then uses a while loop to generate the series up to that limit.
 The loop initializes two variables num1 and num2 to 0 and 1 respectively,
 and then generates each subsequent number in the series by adding num1 and num2.
 The loop continues until the sum exceeds the user-defined limit.
Each number in the series is printed to the console as it is generated.*/
public class FibonacciSeries {
    public static void main(String[] args) {
        // Get input from user for limit of series
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter limit of Fibonacci series: ");
        int limit = scanner.nextInt();
        // Initialize variables
        int num1 = 0, num2 = 1, sum = 0;

        // Print the first two numbers of the series
        System.out.print(num1 + " " + num2 + " ");

        // Loop to generate Fibonacci series
        while (sum <= limit) {
            // Calculate the next number in the series
            sum = num1 + num2;
            // Check if the next number is within the limit
            if (sum <= limit) {
                // Print the next number in the series
                System.out.print(sum + " ");
            }
            // Shift the values to generate the next number in the series
            num1 = num2;
            num2 = sum;
        }
        // Close the scanner object
        scanner.close();
    }
}

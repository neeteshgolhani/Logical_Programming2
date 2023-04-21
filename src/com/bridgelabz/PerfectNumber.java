package com.bridgelabz;

import java.util.Scanner;

/*This program prompts the user to enter a positive integer,
 then checks whether the number is a perfect number by adding up
 its divisors (excluding the number itself) and comparing the sum with the original number.
 If they are equal, the program prints a message saying that the number is a perfect number;
otherwise, it prints a message saying that the number is not a perfect number.*/
public class PerfectNumber {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");

        // Read the integer from the user and store it in a variable
        int num = input.nextInt();

        // Close the scanner object
        input.close();

        // Initialize a variable to store the sum of divisors
        int sum = 0;

        // Loop through all the numbers from 1 to num/2 and add up the divisors
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) { // Check if i is a divisor of num
                sum += i; // If so, add it to the sum
            }
        }

        // Check if the sum of divisors is equal to the original number
        if (sum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
}
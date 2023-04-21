package com.bridgelabz;

import java.util.Scanner;

/*This program prompts the user to enter a positive integer,
  then checks whether the number is prime or not by dividing it by all numbers
  from 2 to the square root of the number (since any factors larger than
  the square root must also have a corresponding factor that is smaller than the square root).
  If any of these divisions has no remainder, the program sets a
  boolean variable isPrime to false and exits the loop early using the break statement.
  If the loop completes without setting isPrime to false, the number must be prime.
The program then outputs a message indicating whether the number is prime or not.*/
public class PrimeNumber {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        // Read the integer from the user and store it in a variable
        int num = input.nextInt();
        // Close the scanner object
        input.close();
        // Initialize a boolean variable to store whether the number is prime
        boolean isPrime = true;
        // Check if the number is less than or equal to 1
        if (num <= 1) {
            // If so, it's not prime
            isPrime = false;
        } else {
            // Otherwise, loop through all numbers from 2 to the square root of the number
            for (int i = 2; i <= Math.sqrt(num); i++) {
                // Check if i is a divisor of num
                if (num % i == 0) {
                    // If so, the number is not prime and we can exit the loop early
                    isPrime = false;
                    break;
                }
            }
        }
        // Output a message indicating whether the number is prime or not
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}

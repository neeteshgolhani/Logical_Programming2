package com.bridgelabz;
import java.util.Random;
import java.util.Scanner;

/*The updated Java code generates random coupon numbers and calculates the total number
of random numbers needed to have all distinct numbers, using Scanner to read the number of
distinct coupon numbers from user input. The code defines two static functions:
generateRandomNumber and getCouponNumbers. generateRandomNumber generates a random
integer between 1 and n. getCouponNumbers repeats until all distinct coupon numbers are collected.
In each iteration, it generates a random number between 1 and n, increments the count,
checks whether the coupon number is collected before, increments the distinct count
if it's not collected before, and marks the coupon number as collected. Finally,
it returns the total number of random numbers needed to collect all distinct coupon numbers.
The main function calls the getCouponNumbers function with the input n and outputs the result.*/
public class CouponNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the number of distinct coupon numbers from user input
        System.out.print("Enter the number of distinct coupon numbers: ");
        int n = input.nextInt();

        // Call the getCouponNumbers function and store the result in a variable
        int totalRandomNumbers = getCouponNumbers(n);

        // Output the total number of random numbers needed to have all distinct numbers
        System.out.println("Total random numbers needed: " + totalRandomNumbers);

        input.close();
    }

    // A static function to generate random numbers between 1 and n
    public static int generateRandomNumber(int n) {
        Random rand = new Random();
        return rand.nextInt(n) + 1;
    }

    // A static function to generate distinct coupon numbers and return the total number of random numbers needed
    public static int getCouponNumbers(int n) {
        int count = 0; // Step 1: Initialize count to 0
        boolean[] isCollected = new boolean[n];
        // Step 2: Create a boolean array of size n to keep track of collected coupon numbers
        int distinctCount = 0; // Step 3: Initialize distinctCount to 0

        while (distinctCount < n) { // Step 4: Repeat until all distinct coupon numbers are collected
            int randomNumber = generateRandomNumber(n); // Step 5: Generate a random number between 1 and n
            count++; // Step 6: Increment the count

            if (!isCollected[randomNumber - 1]) { // Step 7: If the coupon number is not collected before
                distinctCount++; // Step 8: Increment the distinctCount
                isCollected[randomNumber - 1] = true; // Step 9: Mark the coupon number as collected
            }
        }

        return count;
        // Step 10: Return the total number of random numbers needed to collect all distinct coupon numbers
    }
}

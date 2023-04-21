package com.bridgelabz;

import java.util.Scanner;

/*In this program, we first prompt the user to enter a positive integer,
read the integer from the user, and then close the scanner object. We then initialize a variable reverse to 0.
Next, we enter a while loop that continues as long as num is not equal to 0.
Inside the loop, we calculate the rightmost digit of the number by taking
the remainder of the number divided by 10, and store it in a variable digit.
We then multiply reverse by 10 and add digit to it, effectively adding the digit to the reversed number.
Finally, we divide num by 10 to discard the rightmost digit and repeat the loop until num becomes 0.*/
public class ReversedNumber {
    public static void main(String[] args) {
// Create a scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");

        // Read the integer from the user and store it in a variable
        int num = input.nextInt();

        // Close the scanner object
        input.close();

        // Initialize a variable to store the reversed number
        int reverse = 0;

        // Enter a loop that continues as long as num is not equal to 0
        while (num != 0) {
            // Calculate the rightmost digit of the number by taking the remainder of the number divided by 10
            int digit = num % 10;

            // Multiply reverse by 10 and add digit to it to add the digit to the reversed number
            reverse = reverse * 10 + digit;

            // Divide num by 10 to discard the rightmost digit
            num /= 10;
        }

        // Output the reversed number to the console
        System.out.println("The reverse of the number is: " + reverse);
    }
}
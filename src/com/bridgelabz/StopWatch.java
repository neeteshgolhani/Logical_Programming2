package com.bridgelabz;
import java.util.Date;
import java.util.Scanner;

/*We import the java.util.Date class.
We define a main function that prompts the user to press enter to start the stopwatch
and press enter again to stop it, and then calls the stopwatch function to measure and output the elapsed time.
We define a static stopwatch function that takes no input and returns nothing.
Within this function, we create two Date objects: one to store the start
 time and one to store the end time. We then prompt the user to press enter
 to start the stopwatch, and once they do, we store the current time in the start time variable.
 We then prompt the user to press enter again to stop the stopwatch, and once they do,
 we store the current time in the end time variable. We calculate the difference
 between the end time and the start time using
 the getTime method of the Date class, and then output the elapsed time in seconds.*/
public class StopWatch{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create a Scanner object for user input

        System.out.println("Press enter to start the stopwatch.");
        scanner.nextLine(); // wait for the user to press enter to start the stopwatch

        stopwatch(); // call the stopwatch function to measure the elapsed time

        scanner.close(); // close the scanner object
    }

    // the stopwatch function that measures the elapsed time
    public static void stopwatch() {
        Date start = new Date(); // create a Date object to store the start time
        Date end = new Date(); // create a Date object to store the end time

        Scanner scanner = new Scanner(System.in); // create a Scanner object for user input

        System.out.println("Press enter to stop the stopwatch.");
        scanner.nextLine(); // wait for the user to press enter to stop the stopwatch

        end = new Date(); // store the current time in the end time variable

        long diffMillis = end.getTime() - start.getTime(); // calculate the time difference in milliseconds
        double diffSeconds = diffMillis / 1000.0; // convert the time difference to seconds

        System.out.println("Elapsed time: " + diffSeconds + " seconds.");

        scanner.close(); // close the scanner object
    }
}

import java.util.Scanner;

public class ArrayPlay {

    static Scanner keyboard = new Scanner(System.in);

    // Create an array with some numbers
    public static int[] createArray() {
        int[] numbers = { 15, 17, 27, 3, 34, 2, 1, 87, 63, 21, 56, 2 };
        return numbers;
    }

    // Display the array in order
    public static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // move to next line after displaying all numbers
    }

    // Display the array in reverse order
    public static void printArrayReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // move to next line after displaying all numbers
    }

    // Calculate the total of all numbers in the array
    public static int sumArray(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i]; // add each number to total
        }
        return total; // return the total value
    }

    // Calculate the average of all numbers in the array
    public static float avArray(int[] array) {
        int total = sumArray(array); // get the total of the array
        return (float) total / array.length; // divide total by length of array
    }

    // Fill the array with new numbers from user input
    public static void fArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value for element " + (i + 1) + ": ");
            array[i] = keyboard.nextInt(); // get input from user for each element
        }
    }

    public static void main(String[] args) {
        int[] myNumbers = createArray(); // create the initial array
        boolean exitProgram = false; // control variable for the menu

        while (!exitProgram) { // repeat until the user chooses to exit
            System.out.println(); // empty line for formatting
            System.out.println("1. Display array");
            System.out.println("2. Display array backwards");
            System.out.println("3. Display array total");
            System.out.println("4. Display array average");
            System.out.println("5. Change numbers in array");
            System.out.println("6. Exit Program");
            System.out.print("Choose a menu option: ");
            int menuChoice = keyboard.nextInt(); // get user input for menu choice

            // Perform action based on menu choice
            if (menuChoice == 1) {
                showArray(myNumbers); // display array from start to end
            } else if (menuChoice == 2) {
                printArrayReverse(myNumbers); // display array from end to start
            } else if (menuChoice == 3) {
                int total = sumArray(myNumbers); // get the total of the array
                System.out.println("Total: " + total); // display the total
            } else if (menuChoice == 4) {
                float average = avArray(myNumbers); // get the average of the array
                System.out.println("Average: " + average); // display the average
            } else if (menuChoice == 5) {
                fArray(myNumbers); // ask user for new numbers to fill the array
            } else if (menuChoice == 6) {
                exitProgram = true; // exit the program
            }
        }

        System.out.println("Program Terminated."); // display message when exiting
    }
}

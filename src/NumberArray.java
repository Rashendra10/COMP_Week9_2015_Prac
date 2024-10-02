

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NumberArray {

    public static void main(String[] args) {
        // Set the size of the array to store numbers (max 100)
        int[] Intergers = new int[100];
        int count = readNumbersFromFile(Intergers, "txtFiles/numbers.txt");

        // allow user actions
        Scanner input = new Scanner(System.in);
        while (true) {
        // Ask for user promt
            System.out.println("\nChoose an option:");
            System.out.println("1. Display sum of numbers");
            System.out.println("2. Display average of numbers");
            System.out.println("3. Display all numbers");
            System.out.println("4. Write numbers to file");
            System.out.println("5. Exit");

            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Sum: " + addSum(Intergers, count));
            } else if (choice == 2) {
                System.out.println("Average: " + calAverage(Intergers, count));
            } else if (choice == 3) {
                displayNumbers(Intergers, count);
            } else if (choice == 4) {
                writeNumbersToFile(Intergers, count, "numbersoutput.txt");
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Invalid choice, try again.");
            }
        }
        input.close();
    }

    // Read numbers from a file into an array
    public static int readNumbersFromFile(int[] array, String fileName) {
        int count = 0;
        try {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine() && count < 100) {
                String line = fileReader.nextLine().trim();
                if (!line.isEmpty()) { // Checks non-empty lines
                    try {
                        array[count] = Integer.parseInt(line); // Parse an integer
                        count++;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number format: " + line);
                    }
                }
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
        return count;
    }

    // Program which add all the number
    public static int addSum(int[] array, int count) {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += array[i];
        }
        return sum;
    }

    // Program which calculate the average of the number
    public static double calAverage(int[] array, int count) {
        while (count == 0) {
            return 0;
        }
        int sum = addSum(array, count); // Shows sum of all the numbers
        return (double) sum / count;
    }

    //  Program which display the all the number of text.file
    public static void displayNumbers(int[] array, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(array[i]);
        }
    }

    //Write numbers to a file
    public static void writeNumbersToFile(int[] array, int count, String outputFileName) {
        try {
            PrintWriter writer = new PrintWriter(outputFileName);
            for (int i = 0; i < count; i++) {
                writer.println(array[i]);
            }
            writer.close();
            System.out.println("Numbers written to " + outputFileName);
        } catch (FileNotFoundException e) {
            System.out.println("Could not write to file: " + outputFileName);
        }
    }
}

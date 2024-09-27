import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NumberArray {

    public static void main(String[] args) {
        // Set the size of the array to store numbers (max 100)
        int[] numbers = new int[100];
        int count = readNumbersFromFile(numbers, "../txtFiles/Exercise1/numbers1.txt");

        // Menu to allow user actions
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Display sum of numbers");
            System.out.println("2. Display average of numbers");
            System.out.println("3. Display all numbers");
            System.out.println("4. Write numbers to file");
            System.out.println("5. Exit");

            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Sum: " + calculateSum(numbers, count));
            } else if (choice == 2) {
                System.out.println("Average: " + calculateAverage(numbers, count));
            } else if (choice == 3) {
                displayNumbers(numbers, count);
            } else if (choice == 4) {
                writeNumbersToFile(numbers, count, "numbersoutput.txt");
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Invalid choice, try again.");
            }
        }
        input.close();
    }

    // Method to read numbers from a file into an array
    public static int readNumbersFromFile(int[] array, String fileName) {
        int count = 0;
        try {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine() && count < 100) {
                array[count] = Integer.parseInt(fileReader.nextLine());
                count++;
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
        return count;
    }

    // Method to calculate sum
    public static int calculateSum(int[] array, int count) {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += array[i];
        }
        return sum;
    }

    // Method to calculate average
    public static double calculateAverage(int[] array, int count) {
        if (count == 0) {
            return 0;
        }
        return (double) calculateSum(array, count) / count;
    }

    // Method to display all numbers
    public static void displayNumbers(int[] array, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(array[i]);
        }
    }

    // Method to write numbers to a file
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

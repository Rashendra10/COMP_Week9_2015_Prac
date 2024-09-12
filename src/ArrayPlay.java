import java.util.Scanner;

public class ArrayPlay {

  static Scanner keyboard = new Scanner(System.in);
  static final String DELIM = "  ";  // the delimiter to be output between each array value

  /**
   * This method creates the initial integer array
   *
   * @return the array of whole numbers
   */
  public static int[] createArray() {
    int[] numbers = { 15, 17, 27, 3, 34, 2, 1, 87, 63, 21, 56, 2 };
    return numbers;
  }

  /**
   * This method displays all array values to screen starting from the beginning
   * of the array. Each value is separated by a delimiter
   *
   * @param array - the array of numbers to be displayed
   */
  public static void displayArray(int[] array) {

  }

  /**
   * This method calculates the total of all numbers in an array
   *
   * @param array - the array of numbers to be totaled
   * @return the total of all numbers in the array
   */
  public static ???? totalArray(int[] array) {

  }


  /**
   * This method fills an array with values input via keyboard
   *
   * @param array - the array of numbers to be filled
   */
  public static ???? fillArray(int[] array) {

  }

  public static void main(String[] args) {
    boolean exitProgram = false;
    int menuChoice = 0;
    int total;
    float average;

    int[] myNumbers = createArray();           // create the initial array of integers

    while (!(exitProgram)) {
      // Obtain users choice
      System.out.println();
      System.out.println("1. Display array");
      System.out.println("2. Display array backwards");
      System.out.println("3. Display array total");
      System.out.println("4. Display array average");
      System.out.println("5. Change numbers in array");
      System.out.println("6. Exit Program");
      System.out.print("Choose a menu option [1 to 6]:");
      menuChoice = keyboard.nextInt();

      // run menu option chosen by user
      if (menuChoice == 1) {
        displayArray(myNumbers);
      } else if (menuChoice == 2) {
        // call the method to display the array backwards here
      } else if (menuChoice == 3) {
        // call the method to calculate the total here
        System.out.println("\nTotal: " + total);
      } else if (menuChoice == 4) {
        // call the method to calculate the average here
        System.out.println("\nAverage: " + average);
      } else if (menuChoice == 5) {
        // call the method to obtain new array values here
      } else if (menuChoice == 6) {
        exitProgram = true;
      }

    }
    System.out.println("Program Terminated.");
  }

}

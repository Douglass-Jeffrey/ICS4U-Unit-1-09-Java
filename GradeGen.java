/*
* Generates random numbers from user inputted parameters and stores them in an
* an array before averaging and outputting them and the average.
*
* @author  Douglass Jeffrey
* @version 1.0
* @since   2020-11-30
* Class GradeGen.
*/


// Import the Scanner
import java.util.Scanner;  

public class GradeGen {

  /**
   * Function finds average of all numbers in a 2D array.
   */
  static int avgFinder(int[][] numArray) {

    //Defines the number that will be divided by 24 later
    int addVal = 0;

    // adds all numbers in array together
    for (int avgD1Counter = 0; avgD1Counter < numArray.length; avgD1Counter++) {
      for (int avgD2Counter = 0; avgD2Counter < numArray[avgD1Counter].length; avgD2Counter++) {
        addVal += (numArray[avgD1Counter][avgD2Counter]);
      }
    }
    // finds average of all numbers in array
    int markAvg = addVal / 24;
    return markAvg;
  }

  /**
   * Creates the array of random numbers and prints them as well as the 
   * generated random numbers.
   */
  public static void main(String[] args) {

    // defines list of random numbers
    int[][] numArray = new int[4][6];

    // generates random numbers and places them in the array
    for (int d1Counter = 0; d1Counter < 4; d1Counter++) {
      System.out.println();
      System.out.println("student: " + (d1Counter + 1));
      for (int d2Counter = 0; d2Counter < 6; d2Counter++) {
        numArray[d1Counter][d2Counter] = (int) (Math.random() * 99 + 1);
        //prints random numbers placed into array
        System.out.println(numArray[d1Counter][d2Counter]);
      }
    }
    // Calls averaging function to find average of all marks values
    int finalMarkAvg = avgFinder(numArray);
    // prints average of all marks 
    System.out.println("mark average: " + (finalMarkAvg) + "%");
  }
}

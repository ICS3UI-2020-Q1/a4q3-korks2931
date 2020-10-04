import java.util.Scanner;
/**
 * This program will calculate the sum from 1 up to the entered number.
 * @author Sevde
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input 
    Scanner input = new Scanner (System.in);
    // ask the user for an integer 
    System.out.println("Please enter an integer to count down to");
   // create a variable to store integer 
   int integer = input.nextInt();
   // create a variable to keep track of what number we are on 
   int count = 1;
   // the accumulator to add the count into
   int total = 0;
   
   while(count <= integer){
     //add the numbers as we go into total
     total = total + count;
     count =  count + 1; 
    
   }
   // print the total to the screen
   System.out.println("The sum from 1 - " + integer + " is " + total);

      
 }
}
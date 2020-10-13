/**
 * this program creates a method named lastDigit that returns the last digit of an integer.
 * @author Dafna Khripun
 */
public class Main {

// creating a methos that returns the last digit of an integer
public static int lastDigit(int integer){

  // the last integer of the number is the remainder when dividing by 10
  int lastint = integer % 10;

  // return the remainder which is the last digit of the integer
  return lastint;
}

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    // determine the number that you want to know its last integer. works with user's input as well.
    int digit = lastDigit(1467);

    // print the last digit to the screen
    System.out.println(digit);
  }
}

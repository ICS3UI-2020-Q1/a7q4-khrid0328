/**
 * this program creates a method named lastDigit that returns the last digit of an integer.
 * @author Dafna Khripun
 */
public class Main {

public static int lastDigit(int integer){
  int lastint = integer % 10;
  return lastint;
}

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    int digit = lastDigit(1467);
    System.out.println(digit);
  }
}

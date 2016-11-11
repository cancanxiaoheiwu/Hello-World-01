

public class ByteTest {     // Ensure classes/variables have distinctive names.
  public static void main(String args[]) {
    // Initialize variable data of type byte to 1:
    byte data = 1;

    data *= 2; // Multiply by 2: 1st time
    System.out.println("data = " + data);
    data *= 327627; // Multiply by 2: 2nd time
    System.out.println("data = " + data);
    
    
    System.out.println("data = " + data);

    // Don't forget that these integer calculations will be done
    // with 32 bits precision. The result is then stored in data taking the
    // low-order 8 bits of the result as the value to be stored.
    // Since we multiply the -128 value by 2, the result is -256. In binary the
    // low-order 8 bits for this value are zero.

    // This calculation would normally be done in a loop ( a subject covered in chapter 3).
  }
}

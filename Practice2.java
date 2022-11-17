import java.util.Scanner;

public class Practice2 {


    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int inches = scanner.nextInt();

      double meters = inchesToMeters(inches);
      System.out.println((meters * 100)/100);

        
       
    }
    public static double inchesToMeters(int inches ){
    double meters = inches * .0254;
    return meters;
    }
    
}

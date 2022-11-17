import java.util.Scanner;


public class Practice{

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input a two number to add?");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int product = findProductOfTwoNumbers(num1, num2);

        System.out.println("Product of two numbers is "+ product);

    }
    public static int findProductOfTwoNumbers(int num1, int num2){
        return num1*num2;


    }




}

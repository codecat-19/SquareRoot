import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {
        Double num;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number ");
        num = input.nextDouble();

        Double squareroot = Math.sqrt(num);
        System.out.println("The square root of a given number " + num + " = " + squareroot);
    }
}

import java.util.Scanner;
import blando.Calculator;
public class Main {
    public static void main(String[] args) {
        Calculator basicCalculator = new Calculator();

        int x;
        boolean quit = false;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("*Select operation*");
            System.out.println("[1] Addition");
            System.out.println("[2] Subtraction");
            System.out.println("[3] Multiplication");
            System.out.println("[4] Division");
            System.out.println("[5] Exit");

            x = sc.nextInt();

            if (x == 1) {
                float add1;
                float add2;
                float sum;
                System.out.println("Enter the first addends");
                add1 = sc.nextFloat();
                System.out.println("Enter the second addends");
                add2 = sc.nextFloat();
                sum = basicCalculator.addition(add1, add2);
                System.out.println("The sum of " + add1 + " and " + add2 + "is: " + sum);
            } else if (x == 5) {
                quit = true;
                System.out.println("Thank you!");
            } else {
                System.out.println("");


                switch (x) {
                    case 2:
                        float minuend;
                        float subtrahend;
                        float difference;
                        System.out.println("Enter the minuend");
                        minuend = sc.nextFloat();
                        System.out.println("Enter the subtrahend");
                        subtrahend = sc.nextFloat();
                        difference = basicCalculator.subtraction(minuend, subtrahend);
                        System.out.println("The difference of " + minuend + " and " + subtrahend + "is: " + difference);
                        break;

                    case 3:
                        float multiplicand;
                        float multiplier;
                        float product;
                        System.out.println("Enter the multiplicand");
                        multiplicand = sc.nextFloat();
                        System.out.println("Enter the multiplier");
                        multiplier = sc.nextFloat();
                        product = basicCalculator.multiplication(multiplicand, multiplier);
                        System.out.println("The product of " + multiplicand + " and " + multiplier + "is: " + product);
                        break;

                    case 4:
                        float dividend;
                        float divisor;
                        float quotient;
                        System.out.println("Enter the dividend");
                        dividend = sc.nextFloat();
                        System.out.println("Enter the divisor");
                        divisor = sc.nextFloat();
                        quotient = basicCalculator.division(dividend, divisor);
                        System.out.println("The quotient of " + dividend + " and " + divisor + "is: " + quotient);
                        break;
                }

            }
        } while (x >= 6);
    }
}
package blando;

public class Calculator {
    public float addition(float number1, float number2)
    {
        return number1 + number2;
    }
    public float subtraction(float number1, float number2)
    {
        return number1 - number2;
    }
    public float multiplication(float number1, float number2)
    {
        return number1 * number2;
    }
    public float division(float number1, float number2)
    {
        if (number2 == 0)
        {
            System.out.println("I can't divide by zero..");
            return 0;
        }
        return  number1/number2;
    }
}
package at.campus02.bsd;

public class Calculator {
    public static double add(double number1, double number2){
        return number1 + number2;
    }
    public static double minus(double number1, double number2){
        return number1 - number2;
    }
    public static double divide(double number1, double number2){
        if(number2 !=0){
            return number1 / number2;
        }else{
            throw new ArithmeticException();
        }

    }
    public static double multiply(double number1, double number2){
        return number1 * number2;
    }

    public static int factorial(int number) {
        int result = 1;

        if(number == 0){
            return 1;
        }
        else if (number > 0){
            while(number > 0){
                result = result * number;
                number--;
            }
            return result;
        }
        throw new ArithmeticException();
    }
}

package at.campus02.bsd;

public class Calculator {

    /**
     * add() adds two input numbers
     * @param number1 first number to add
     * @param number2 second number to add
     * @return result
     */
    public static double add(double number1, double number2){
        return number1 + number2;
    }

    /**
     * minus() subtracts the second number from the first
     * @param number1 number to subtract from
     * @param number2 number to subtract
     * @return result
     */
    public static double minus(double number1, double number2){
        return number1 - number2;
    }

    /**
     * divide divides one number from the other
     * @param number1 first number
     * @param number2 second number
     * @return result
     */
    public static double divide(double number1, double number2){
        if(number2 !=0){
            return number1 / number2;
        }else{
            throw new ArithmeticException();
        }

    }

    /**
     * multiply() multiplies the two input numbers
     * @param number1 first number
     * @param number2 second number
     * @return result
     */
    public static double multiply(double number1, double number2){
        return number1 * number2;
    }

    /**
     * factorial() calculates the factorial of the input number
     * @param number input number
     * @throws ArithmeticException in case of number < 0
     * @return result of factorial
     */
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

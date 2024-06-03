package at.campus02.bsd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calc;
    @BeforeEach
    void setup(){
        calc = new Calculator();
    }
    @DisplayName("Testing add() method")
    @Test
    void testAdd(){
        assertEquals(5, calc.add(2,3));
    }
    @DisplayName("Testing add() method with negative")
    @Test
    void testAddNegative(){
        assertEquals(0, calc.add(-3,3));
    }
    @DisplayName("Testing add() method with negative")
    @Test
    void testAddKomma(){
        assertEquals(8.8, calc.add(5.8,3));
    }
    @DisplayName("Testing minus()")
    @Test
    void testMinus(){
        assertEquals(5, calc.minus(8,3));
    }
    @DisplayName("Testing minus() negative result")
    @Test
    void testMinusNegativeRes(){
        assertEquals(-12, calc.minus(8,20));
    }
    @DisplayName("Testing minus() negative Input")
    @Test
    void testMinusNegative(){
        assertEquals(-40, calc.minus(-20,20));
    }
    @DisplayName("Testing multiply()")
    @Test
    void testMultiply(){
        assertEquals(20, calc.multiply(5,4));
    }
    @DisplayName("Testing multiply() with negative Input")
    @Test
    void testMultiplyNegative(){
        assertEquals(-25, calc.multiply(-5,5));
    }
    @DisplayName("Testing multiply() x 0")
    @Test
    void testMultiplyNull(){
        assertEquals(0, calc.multiply(0,5));
    }
    @DisplayName("Testing divide()")
    @Test
    void testDivide(){
        assertEquals(2, calc.divide(8,4));
    }
    @DisplayName("Testing divide() with 0")
    @Test
    void testDivideNull(){
        assertThrows(ArithmeticException.class, () -> calc.divide(8,0));
    }
    @DisplayName("Testing divide() with greater than first")
    @Test
    void testDivideGreater(){
        assertEquals(0.5, calc.divide(8,16));
    }

    //Fakultät
    @DisplayName("Testing factorial()")
    @Test
    void testFactorial(){
        assertEquals(720, calc.factorial(6));
    }
    @DisplayName("Testing factorial() negative Numbers")
    @Test
    void testFactorialNegative(){
        assertThrows(ArithmeticException.class, () -> calc.factorial(-6));
    }
    @DisplayName("Testing factorial() Null")
    @Test
    void testFactorialNull(){
        assertEquals(1, calc.factorial(0));
    }

}

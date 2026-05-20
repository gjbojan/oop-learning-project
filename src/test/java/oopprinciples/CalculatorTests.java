package oopprinciples;

import calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTests {

    Calculator calculator = new Calculator(10,20);
    Calculator calculator2 = new Calculator();

    @Test
    public void calculatorAdditionTests() {
        assertEquals(30, calculator.sumOfTwoNumbers(), 0.0001);

        calculator2.setNum1(20);
        calculator2.setNum2(20);

        assertEquals(40, calculator2.sumOfTwoNumbers(), 0.0001);

        assertEquals(-10, calculator.workingCalculator('-'),0.0001);
        assertEquals(0.5, calculator.workingCalculator('/'),0.0001);

        assertEquals(0, calculator2.workingCalculator('-'),0.0001);


    }


}

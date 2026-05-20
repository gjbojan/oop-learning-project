package selectiondecisionrepetitionarray;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SelectionsVezba {
    double actionCalculator(double num1, double num2, char znak) {
        if(znak == '+') {
            return num1+num2;
        }
        else if(znak == '-') {
            return num1-num2;
        }
        else if(znak == '*') {
            return num1*num2;
        }
        else if(znak == '/' && num2 == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        else if(znak == '/') {
            return num1/num2;
        }
        else {
            System.out.println("The sign must be +,-,* or /");
            return 0;
        }
    }

    @Test
    public void actionCalculator() {
        assertEquals(30, actionCalculator(10,20,'+'), 0.0001);
        assertEquals(-10, actionCalculator(10,20,'-'), 0.0001);
        assertEquals(200,actionCalculator(10,20,'*'), 0.0001);
        assertEquals(0.5, actionCalculator(10,20,'/'), 0.0001);
        assertEquals(0,actionCalculator(10,10,'-'),0.0001);
        assertEquals(0,actionCalculator(10,0,'/'),0.0001);
        assertEquals(0,actionCalculator(10,20,'%'), 0.0001);
    }
}

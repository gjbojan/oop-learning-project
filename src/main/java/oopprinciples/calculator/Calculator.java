package calculator;

public class Calculator {

    double num1, num2;

    //prazen constructor
    public Calculator() {

    }

    public void setNum1(double num) {
        this.num1 = num;
    }

    public void setNum2(double num) {
        this.num2 = num;
    }

    //get-eri za validacija
    //int za cuvanje na vrednost post e cifra
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }


    //poln constructor
    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double sumOfTwoNumbers() {
        return num1+num2;
    }

    public double workingCalculator(char znak) {
        if (znak == '+') {
            return num1 + num2;
        } else if (znak == '-') {
            return num1 - num2;
        } else if (znak == '*') {
            return num1 * num2;
        } else if (znak == '/' && (num1!=0 || num2!=0)) {
            return num1/num2;
        }
        else
            return 0;
    }

    //isto ime razlicen return i variables vo nego

    public int addition(int num1, int num2) {
        return num1+num2;
    }
    public int addition(int num1, int num2, int num3) {
        return num1+num2+num3;
    }
    public int addition(int num1, int num2, int num3, int num4) {
        return num1+num2+num3+num4;
    }
}

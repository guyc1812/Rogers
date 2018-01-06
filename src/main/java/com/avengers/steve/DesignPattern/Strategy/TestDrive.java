package com.avengers.steve.DesignPattern.Strategy;

/*****
 * Created by apple on 2017/10/30.
 */
public class TestDrive {

    public static void main(String[] args) {
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }

}

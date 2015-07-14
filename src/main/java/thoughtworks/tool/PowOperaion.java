/*
 * Copyright 2008 Inc.
 *
 * (details of open-source license...)
 */


package thoughtworks.tool;

/**
 * Created by flin on 7/13/15.
 */
public class PowOperaion implements Operation {
    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return Math.pow(firstNumber, secondNumber);
    }
}

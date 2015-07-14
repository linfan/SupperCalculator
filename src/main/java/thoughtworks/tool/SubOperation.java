/*
 * Copyright 2008 Inc.
 *
 * (details of open-source license...)
 */


package thoughtworks.tool;

/**
 * Created by flin on 7/13/15.
 */
public class SubOperation implements Operation {
    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }
}

/*
 * Copyright 2008 Inc.
 *
 * (details of open-source license...)
 */

package thoughtworks.model;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void shouldCalculate() {
        Calculator calculator = new Calculator();
        calculator.setFirstNumber(1.0);
        calculator.setOperation('+');
        calculator.setSecondNumber(2.0);
        double result = calculator.calculate();
        assertThat(result, is(3.0));
    }
}

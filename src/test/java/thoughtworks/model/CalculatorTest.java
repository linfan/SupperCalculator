/*
 * Copyright 2015 ThoughtWorks Inc.
 *
 * For demo only.
 */

package thoughtworks.model;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void shouldCalculateAdd() {
        Calculator calculator = new Calculator();
        calculator.setFirstNumber(1.0);
        calculator.setOperation('+');
        calculator.setSecondNumber(2.0);
        double result = calculator.calculate();
        assertThat(result, is(3.0));
    }

    @Test
    public void shouldCalculateSubtract() {
        Calculator calculator = new Calculator();
        calculator.setFirstNumber(3.0);
        calculator.setOperation('-');
        calculator.setSecondNumber(1.5);
        double result = calculator.calculate();
        assertThat(result, is(1.5));
    }

    @Test
    public void shouldCalculateMultiply() {
        Calculator calculator = new Calculator();
        calculator.setFirstNumber(4.0);
        calculator.setOperation('*');
        calculator.setSecondNumber(2.0);
        double result = calculator.calculate();
        assertThat(result, is(8.0));
    }

    @Test
    public void shouldCalculateDivide() {
        Calculator calculator = new Calculator();
        calculator.setFirstNumber(6.0);
        calculator.setOperation('/');
        calculator.setSecondNumber(2.0);
        double result = calculator.calculate();
        assertThat(result, is(3.0));
    }
}

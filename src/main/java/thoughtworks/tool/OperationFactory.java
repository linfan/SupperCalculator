/*
 * Copyright 2008 Inc.
 *
 * (details of open-source license...)
 */


package thoughtworks.tool;

import java.util.HashMap;
import java.util.Map;

public class OperationFactory {

    private static Map<Character, Operation> operations =  new HashMap<Character, Operation>() {
        {
            put('+', new AddOperation());
            put('-', new SubOperation());
            put('*', new MulOperation());
            put('/', new DivOperaion());
            put('^', new PowOperaion());
        }
    };

    public static double calculate(double firstNumber, double secondNumber, char op) {
        Operation operation = OperationFactory.operations.get(op);
        return operation == null ? 0 : operation.calculate(firstNumber, secondNumber);
    }
}

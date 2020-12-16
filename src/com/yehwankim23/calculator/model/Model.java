package com.yehwankim23.calculator.model;

public class Model {
    private final String ERROR = "Error";

    public String calculate(String answer, char operation, String input) {
        if (answer.equals(ERROR) || (operation == '÷' && input.equals("0"))) {
            return ERROR;
        }

        double answerAsDouble = Double.parseDouble(answer);
        double inputAsDouble = Double.parseDouble(input);

        switch (operation) {
            case '+':
                answerAsDouble += inputAsDouble;
                break;
            case '–':
                answerAsDouble -= inputAsDouble;
                break;
            case '×':
                answerAsDouble *= inputAsDouble;
                break;
            case '÷':
                answerAsDouble /= inputAsDouble;
                break;
            default:
                throw new UnsupportedOperationException("Model.calculate().switch().default");
        }

        return Double.toString(answerAsDouble);
    }
}

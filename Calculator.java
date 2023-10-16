package sk.pavelmikuska.calculator;

import java.util.Scanner;

public class Calculator {
    private float number1;
    private float number2;
    private float result;

    Scanner scanner = new Scanner(System.in);
    ScreenPrinter screenPrinter;
    public void run() {

        screenPrinter = new ScreenPrinter();
        screenPrinter.showIntro();
        String option = "";
        while (!option.equals("x")) {
            screenPrinter.showInstructions();
            option = scanner.nextLine().toLowerCase();
            switch (option) {
                case "+":
                    performCalculation(option);
                    break;
                case "-":
                    performCalculation(option);
                    break;
                case "*":
                    performCalculation(option);
                    break;
                case "/":
                    performCalculation(option);
                    break;
                case "x":
                    System.out.println("Closing application...");
                    break;
                default:
                    System.out.println("Wrong input. Enter symbol '+', '-', '*', '/' for operation or 'x' for end");
            }
        }
    }

    private void performCalculation(String option) {
        screenPrinter.showOperation(option);
        number1 = readNumberFromUser("number1");
        number2 = readNumberFromUser("number2");
        result = getResult(number1, number2, option);
        screenPrinter.showResult(number1, number2, option, result);

        System.out.println("Press Enter to continue");
        scanner.nextLine();
    }

    private float getResult(float number1, float number2, String option) {
        if (option.equals("+"))
            return number1 + number2;
        if (option.equals("-"))
            return number1 - number2;
        if (option.equals("*"))
            return number1 * number2;
        if (option.equals("/"))
            return number1 / number2;
        return 0;
    }

    private float readNumberFromUser(String numberName) {
        float number;
        while (true) {
            System.out.println("Enter " + numberName + " and confirm by pressing Enter.");
            String input = scanner.nextLine();
            try {
                number = Float.parseFloat(input);
                return number;
            } catch (Exception e) {
                System.out.println("Incorrect input. Enter the number.");
            }
        }
    }
}

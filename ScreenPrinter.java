package sk.pavelmikuska.calculator;

public class ScreenPrinter {

    public void showIntro() {
        System.out.println("                          >>> CALCULATOR <<<");
        System.out.println("==============================================================================");
        System.out.println(" # Instructions:");
        System.out.println(" # To navigate the app enter the operation sign to the console and press Enter\n");
    }

    public void showInstructions() {
        System.out.println("========================");
        System.out.println("Choose OPERATION or END:");
        System.out.println("\"+\"  for addition");
        System.out.println("\"-\"  for subtraction");
        System.out.println("\"*\"  for multiplication");
        System.out.println("\"/\"  for division");
        System.out.println("\"x\"  for end");
        System.out.println("========================");
    }

    public void showOperation(String operation) {
        System.out.println("\nOPERATION: " + operation);
        System.out.println("========================");
    }

    public void showResult(float number1, float number2, String operation, float result) {
        System.out.println("\nRESULT:");
        System.out.println("========================");
        System.out.println(number1 + " " + operation + " " +  number2 + " = " + result);
        System.out.println();
    }
}

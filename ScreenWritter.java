package sk.pavelmikuska.referencie.calculator;

public class ScreenWritter {

    public void showIntro() {
        System.out.println(">> CALCULATOR <<");
    }

    public void showInstructions() {
        System.out.println("========================");
        System.out.println("Choose OPERATION or END:");
        System.out.println("\"+\"  for plus");
        System.out.println("\"-\"  for minus");
        System.out.println("\"+\"  for multiple");
        System.out.println("\"/\"  for devide");
        System.out.println("\"x\"  for end");
        System.out.println("========================");
    }

    public void showOperation(String operation) {
        System.out.println("OPERATION: " + operation);
        System.out.println("========================");
    }

    public void showResult(float number1, float number2, String operation, float result) {
        System.out.println("========================");
        System.out.println("RESULT:");
        System.out.println(number1 + " " + operation + " " +  number2 + " = " + result);
        System.out.println();
    }
}

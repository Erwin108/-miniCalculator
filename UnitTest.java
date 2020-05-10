public class UnitTest {
    public static void main(String args[]) {
        MiniCalculator miniCalc = new MiniCalculator();
        miniCalc.multiply(5);
        if (miniCalc.calculate() != 5) {
            System.out.println("\n\tFAILED TO MULTIPLY");
        } else {
            System.out.println("\n\tSUCCESS TO MULTIPLY");
        }
        miniCalc.divide(2);
        if (miniCalc.calculate() != 2) {
            System.out.println("\n\tFAILED TO DIVIDE");
        } else {
            System.out.println("\n\tSUCCESS TO DIVIDE");
        }
    }
}
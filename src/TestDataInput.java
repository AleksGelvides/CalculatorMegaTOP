import java.util.Scanner;

public class TestDataInput {
    static char operator;
    static int operand1;
    static int operand2;
    public static void inOperator() {
        Scanner scanner = new Scanner(System.in);
        char oper1 = scanner.next().charAt(0);
        operator = oper1;
        int operInt1 = scanner.nextInt();
        operand1 = operInt1;
        int operInt2 = scanner.nextInt();
        operand2 = operInt2;
    }
}

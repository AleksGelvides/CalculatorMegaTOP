import java.util.Scanner;

public class TestDataInput {
    static char operator;
    static int operand1;
    static int operand2;
    public static void inOperator() {
        Scanner scanner = new Scanner(System.in);
        char oper1 = scanner.next().charAt(0);
        operator = oper1;
    }
}

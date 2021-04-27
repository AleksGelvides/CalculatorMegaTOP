import java.util.Scanner;

class calculation {
    static double cOperand1;
    static double cOperand2;
    static char cOperation;
    public static void inPutting() {
         Scanner scanner = new Scanner(System.in);
            double operand1 = 0;
            double operand2 = 0;
            char operation;
        if(scanner.hasNextDouble()) operand1 = scanner.nextDouble();
        else System.out.println("Неверный первый операнд");
             operation = scanner.next().charAt(0);
        if(scanner.hasNextDouble()) operand2 = scanner.nextDouble();
        else System.out.println("Неверный второй операнд");
        cOperand1 = operand1;
        cOperand2 = operand2;
        cOperation = operation;
        System.out.println(calculate(operand1, operand2, operation));
}

    public static double calculate(double operand1, double operand2, char operation){ // Метод для вычисления выражения
        double result = 0;
        switch (operation) {
            case '+' -> result = operand1 + operand2;
            case '-' -> result = operand1 - operand2;
            case '*' -> result = operand1 * operand2;
            case '/' -> result = operand1 / operand2;
            default -> System.out.println("Ошибка вычисления");
        }
    return result;
    }
}

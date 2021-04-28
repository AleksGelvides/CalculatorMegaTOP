import java.util.Scanner;

class calculation {
    static double cOperand1;
    static char cOperation;
    public static void inPutting() {
        double operand1 = 0;
        double operand2 = 0;
        char operation;
        boolean inPutting = true;
        while (inPutting == true) {

            Scanner scanner = new Scanner(System.in);
            if (cOperand1 == 0) {
                if (scanner.hasNextDouble()) {
                    operand1 = scanner.nextDouble();
                } else System.out.println("Неверный первый операнд");}
            else if (cOperand1 != 0) {
                    operand1 = cOperand1;
                }
            operation = scanner.next().charAt(0);
            switch (operation){
                case 's' -> inPutting = false;
                case 'c' -> inPutting = false;
                default -> inPutting = true;
            }
            if (operation == 's') {
                cOperation = operation;}
                else if (operation == 'c'){
                   cOperation = operation;
                }
            if (!inPutting){
                break;}
            if (scanner.hasNextDouble()) operand2 = scanner.nextDouble();
            else System.out.println("Неверный второй операнд");
            cOperand1 = calculate(operand1, operand2, operation);
        }
    }


    public static double calculate(double operand1, double operand2, char operation){ // Метод для вычисления выражения
        double result = 0;
        switch (operation) {
            case '+' -> result = operand1 + operand2;
            case '-' -> result = operand1 - operand2;
            case '*' -> result = operand1 * operand2;
            case '/' -> {
                if(operand2 == 0) result = 0;
                else result = operand1 / operand2;
            }
            default -> System.out.println("Ошибка вычисления");
        }
        System.out.println(result);
    return result;
    }
}

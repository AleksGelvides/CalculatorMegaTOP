import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
            double operand1 = 0;
            double operand2 = 0;
            char operation;


        if(scanner.hasNextDouble()) operand1 = scanner.nextDouble();
        else System.out.println("Неверный первый операнд");
             operation = scanner.next().charAt(0);
        if(scanner.hasNextDouble()) operand2 = scanner.nextDouble();
        else System.out.println("Неверный второй операнд");

    calculate(operand1, operand2, operation);


}

    static void calculate(double operand1, double operand2, char operation){ // Метод для вычисления выражения
        switch (operation) {
            case '+' -> System.out.println(operand1 + operand2);
            case '-' -> System.out.println(operand1 - operand2);
            case '*' -> System.out.println(operand1 * operand2);
            case '/' -> System.out.println(operand1 / operand2);
            default -> System.out.println("Ошибка вычисления");
        }

    }
}

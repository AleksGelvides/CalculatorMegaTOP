public class Main {
    public static void main(String[] args) {
        boolean workProcess = true;
        boolean calculationProcess = true;
        while (workProcess == true) {
                while (calculationProcess == true){
                    TestDataInput.inOperator();
                    switch (TestDataInput.operator) {
                        case 'c':
                            calculationProcess = false;
                        case 's':
                            workProcess = false;
                        default:
                            System.out.println("Решение продолжается");
                            break;
                    }
                    System.out.flush();
                }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        boolean workProcess = true;
        boolean calculationProcess;
        while (workProcess == true) {
            calculationProcess = true;
            while (calculationProcess == true){
                    TestDataInput.inOperator();
                switch (TestDataInput.operator) {
                        case 's':
                            workProcess = false;
                            break;
                }
                if (TestDataInput.operator == 'c'){
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    calculationProcess = false;}
                if (!workProcess) {
                    break; }
                System.out.println("Вы ввели " + TestDataInput.operator);
            }
        }
    }
}

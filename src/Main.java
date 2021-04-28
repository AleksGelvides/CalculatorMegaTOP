import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        boolean workProcess = true;
        boolean calculationProcess;
        while (workProcess == true) {
            calculationProcess = true;
            while (calculationProcess == true){
                System.out.println("Введите:");
                calculation.inPutting();
                switch (calculation.cOperation) {
                        case 's':
                            workProcess = false;
                            break;
                }
                if (calculation.cOperation == 'c'){
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    calculation.cOperand1 = 0;
                    calculationProcess = false;}
                if (calculation.cOperation == 's'){
                    workProcess = false;
                break;}
//                System.out.println("Вы ввели " + calculation.cOperation);
            }
        }
    }
}

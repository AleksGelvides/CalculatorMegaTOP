import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        boolean workProcess = true;
        boolean calculationProcess;
        while (workProcess == true) {
            calculationProcess = true;
            while (calculationProcess == true){
                calculation.inPutting();
                switch (calculation.cOperation) {
                        case 's':
                            workProcess = false;
                            break;
                }
                if (calculation.cOperation == 'c'){
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    calculationProcess = false;}
                if (!workProcess) {
                    break; }
//                System.out.println("Вы ввели " + calculation.cOperation);
            }
        }
    }
}

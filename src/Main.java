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
                            break;
                        case 's':
                            workProcess = false;
                            break;
                }
                if (calculationProcess == false){
                    System.out.flush();}
                if (workProcess  == false) {
                    break;
                }
            }
        }
    }
}

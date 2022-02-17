public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.println("this is i at: " + i);
            i++;
        }
        System.out.println("----------");

//        long j = 2;
//        do {
//            System.out.println("this is j at: " + j);
//            j+=2;
//        } while (j <= 100);
//        do {
//            System.out.println("this is j at: " + j);
//            j-=5;
//        } while (j >= -10);
//        do {
//            System.out.println("this is j at: " + j);
//            j*=j;
//        } while (j < 1000000); // notice: for this volume of number, you have to change type of the variable to correct parameters.

        for (int j = 100; j >= -10; j-=5 ) {
            System.out.println("j is at: " + j);
        }
        System.out.println("----------> break <--------");
        for (long j = 2; j < 1000000; j*=j) {
            System.out.println("j is at: " + j);
        }






//        NOTES ON LOOPS
//        for(int i = 0; i <= 10; i++){
//            System.out.println("i is at: " + i);
//        }

//        int i = 0;
//        while (i < 10) {
//            System.out.println("i is: " + i);
//            i++;
//        }

//        int i = 0;
//        do {
//            System.out.println("i is at: " + i);
//            i++;
//        } while (i< 10);
    }
}

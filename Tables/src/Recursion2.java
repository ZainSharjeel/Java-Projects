public class Recursion2 {

    static int r1=0, r2=1, r3=0;

     static void printSeries(int count) {
         if (count > 0) {
             r3 = r1 + r2;
             r1 = r2;
             r2 = r3;
             System.out.print(" " + r3);
             printSeries(count -1);
         }
     }

    public static void main(String[] args) {
        int count =15;
        System.out.print(r1 + " " + r2);
        printSeries(count-2);
    }
}

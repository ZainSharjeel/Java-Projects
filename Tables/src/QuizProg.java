import java.util.*;
public class QuizProg {

    public static void trianlge(int n,char chr) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print(chr + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=input.nextInt();
        System.out.println("Enter the symbol");
        char symbol=input.next().charAt(0);
        trianlge(num,symbol);

    }
}

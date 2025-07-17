import java.util.Scanner;

public class CirclePattern2 {
    public static void circle(int n, char chr) {
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            for (int j =1; j <=n+i; j++) {
                System.out.print(chr + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(" ");
            }
            for (int j =(n-i+2); j <=0; j--) {
                System.out.print(chr + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        System.out.println("Enter the symbol");
        char symbol = input.next().charAt(0);
        circle(num,symbol);
        circle(num,symbol);
    }
}



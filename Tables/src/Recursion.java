import java.util.InputMismatchException;

public class Recursion {

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }


    public static void main(String[] args) {
        try {
            int i;
            int fact = 1;
            int num = 5;
            fact = factorial(num);
            System.out.println(num + fact);
        } catch (InputMismatchException e) {
            System.out.println(e);
        }
    }
}
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number to you want to see the table of");
        int n=input.nextInt();
        table(n);
    }

    public static void table(int n)
    {
        int result=0;
        for (int i = 1; i <= 10; i++)
        {
            System.out.printf("%d * %d = %d ", n, i, result = n * i);
            System.out.println();
        }
    }

}
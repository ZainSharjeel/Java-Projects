import java.util.*;
public class MethodsExercises {

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=input.nextInt();
        System.out.println("Enter the second number");
        int num2=input.nextInt();
        System.out.println("Enter the third number");
        int num3=input.nextInt();
    }

    public static int max(int a,int b, int c)
    {
        if (a>b && a>c) {
            System.out.println("The largest number is " + a);
        }
        return a;
    }

}

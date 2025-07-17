import java.util.*;
public class Task1 {

    public static void main(String[]args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size");
        int size1 = input.nextInt();
        System.out.println("Enter the size2");
        int size2=input.nextInt();
        int [][]arr=new int[size1][size2];
        System.out.println("Please enter the value of array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}

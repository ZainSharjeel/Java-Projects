import java.util.*;
public class zainMultiply {

    //int a[][]={{1,1,1},{2,2,2},{3,3,3}};
    //int b[][]={{1,1,1},{2,2,2},{3,3,3}};


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of array 1");
        int size1=input.nextInt();
        System.out.println("Enter the size 2 of array 1");
        int size2=input.nextInt();
        System.out.println("Enter the size 1 of array 2");
        int size3=input.nextInt();
        System.out.println("Enter the size 3 of array 2");
        int size4=input.nextInt();
        if (size2==size3) {
            int c[][] = new int[size1][size4];
            int[][] a = new int[size1][size2];
            int[][] b = new int[size3][size4];
            System.out.println("Enter the values of array 1");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = input.nextInt();
                }
            }
            System.out.println("Enter the values of array 2");
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < b[i].length; j++) {
                    b[i][j] = input.nextInt();
                }
            }

            for (int i = 0; i < size1; i++) {
                for (int j = 0; j < size4; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k < size4; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Multiplication not possible");
        }
    }
}

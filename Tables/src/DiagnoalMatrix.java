import java.util.*;
public class DiagnoalMatrix {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows, col;
        int m[][];
        System.out.print("Enter the number of rows ");
        rows = input.nextInt();
        System.out.print("Enter the number of column ");
        col = input.nextInt();
        m = new int[rows][col];
        System.out.println("Enter the values");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                m[i][j] = input.nextInt();
            }
        }
        if (rows == col) {
            System.out.print("Diagonal elements ");
            for (int i = 0; i < rows; i++) {
                System.out.println(m[i][i] + " ");
            }
        } else {
            System.out.println("Not diagonal");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coinq1;
import java.util.*;
/**
 *
 * @author 26922
 */
public class CoinQ1 {
    
    public static String decToBin(int n)
    {
        int a=0;
        int []binary=new int[9];
        while(n>0) {
            binary[a++] = n % 2;
            n = n / 2;
        }
        String store="";
        for (int i = 9-1; i >=0; i--) {
            store=store + binary[i];
        }
        return store;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number between 0 and 511");
        int num=input.nextInt();
        String str=decToBin(num);
        System.out.println(decToBin(num));
        int count=0;
        String [][]grid=new String[3][3];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (str.charAt(count)=='0') {
                    grid[i][j]="H";
                }
                else if (str.charAt(count)=='1') {
                    grid[i][j]="T";
                }
                count++;
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transposematrix;
import java.util.*;
/**
 *
 * @author 26922
 */
public class TransposeMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][]m1={{1,2},{3,4}};
        for (int i = 0; i < m1.length; i++) 
        {
            for (int j = 0; j < m1.length; j++) {
                if (i>j)
                {
                    int temp=m1[i][j];
                    m1[i][j]=m1[j][i];
                    m1[j][i]=temp;
                }
            }
        }
        for (int i = 0; i < m1.length; i++) 
        {
            for (int j = 0; j < m1.length; j++) 
            {
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }
        
    
    
    }
    
}

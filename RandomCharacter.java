/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomcharacter;
import java.util.*;
/**
 *
 * @author 26922
 */
public class RandomCharacter {
    public static char[]randomchar()
    {
        char []chr=new char[100];
        int random=0;
        for (int i = 0; i < chr.length; i++)
        {
            chr[i]=(char)('a'+Math.random()*26);
        }
        return chr;
                }
    

    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        char[] arr=randomchar();
        int [] freq=new int[26];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < freq.length; j++) {
                if (arr[i]-97 == freq[j])
                {
                    freq[j]++;
                }
            }
            System.out.print("["+ arr[i] + "}" + " ");
        }
        System.out.println("\n");
            System.out.println("Enter the character you want to know the frequency");
            char x=input.next().charAt(0);
            System.out.println("The frequency of " + x + " is " + freq[x-'a']);
               
        
    }
    
}

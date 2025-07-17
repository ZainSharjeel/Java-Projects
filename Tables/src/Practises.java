import java.util.*;
public class Practises {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=input.nextInt();
        String []arr=new String[size];
        System.out.println("Enter the values of array");
        for (int i = 0; i < size; i++) {
            arr[i]=input.next();
        }
        if (size==0) {
            System.out.println("Size should be greater than 1");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==",") {
                arr[i].split(",");
            }
            int sum1=0,sum2=0;
            int x=Integer.parseInt(arr[i]);
            sum1+=x;
            int y=Integer.parseInt(arr[i++]);
            sum2+=y;
           if (sum1==sum2) {
               System.out.println("Can balance");
           }
           else {
               System.out.println("Cannot balance");
           }
        }



    }


    }

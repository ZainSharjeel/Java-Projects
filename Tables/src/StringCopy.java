import java.util.*;
public class StringCopy {

    public static void main(String[] args) {
        String strOrig,strCopy;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string");
        strOrig=input.nextLine();
        strCopy=strOrig;
        System.out.println("String Orignal " + strOrig);
        System.out.println("String Copy " + strCopy);
    }

}

import java.util.*;

public class StringRecursion {

    public static String subSequence(String s1, String s2) {
        if (s1.length() <= 1 && s2.length() <= 1) {
            return " ";
        }
        if (s1.contains(s2)) {
            int i = 0;
            char chr[] = new char[s2.length()];
            if (s1.charAt(i) == s2.charAt(i)) {
                chr[i] = s2.charAt(i);
                i++;
                subSequence(s1.substring(0, s1.length() - 1), s2);
            } else {
                int count = 0;
                count++;
            }
        }
        else {
            if (s2.contains(s1)) {
                int i = 0;
                char chr[] = new char[s1.length()];
                if (s2.charAt(i) == s1.charAt(i)) {
                    chr[i] = s1.charAt(i);
                    i++;
                    subSequence(s1, s2.substring(0, s2.length() - 1));
                } else {
                    int count = 0;
                    count++;
                }
            }
        }
        return "Not matched";
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1=input.nextLine();
        System.out.println("Enter the second string");
        String str2=input.nextLine();
        System.out.println(subSequence(str1,str2));
    }

}

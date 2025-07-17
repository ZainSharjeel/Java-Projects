import java.util.*;
public class Task2Strings {

    public static void consecNum(String n) {
        for (int i = 0; i < n.length(); i++) {

            if (n.charAt(i)+n.charAt(i++)==n.charAt(i+2)) {
                System.out.println(n);
            }
            else if (n.charAt(i)-n.charAt(i++)==n.charAt(i+2)) {
                System.out.println(n);
            }
            else {
                System.out.println("Not consecutive numbers");
            }
        }
    }

    public static void main(String[]ags) {
        String num="1-2-3-4-5";
        consecNum(num);

    }
}

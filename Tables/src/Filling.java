import java.io.*;
public class Filling {

    public static void main(String[]args) {
        File file=new File("C:\\Users\\Zain Sharjeel\\OneDrive\\Desktop\\zainiba.txt");
        try {
            boolean value =file.createNewFile();
            if (value) {
                System.out.println("file is created");
            }
            else {
                value= file.delete();
                System.out.println("file is deleted");
            }
        }
        catch (Exception e) {
            e.getStackTrace();
        }

    }


}

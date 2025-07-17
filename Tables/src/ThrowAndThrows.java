import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowAndThrows {

    static void thrill() throws FileNotFoundException {
        FileReader file = new FileReader("C:\\Users\\Zain Sharjeel\\OneDrive\\Desktop\\new.txt");
        BufferedReader fileinput = new BufferedReader(file);
        throw new FileNotFoundException("");
    }

    public static void main(String[] args) {

        try {
            thrill();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Run the code");

    }

}

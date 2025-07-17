import java.io.*;


public class BufferReader {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter the Player name");
        String name=br.readLine();
        System.out.println("Welcome new player " + name);

    }
}

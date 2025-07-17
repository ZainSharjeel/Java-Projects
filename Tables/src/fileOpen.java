import java.awt.*;
import java.io.File;

public class fileOpen {

    public static void main(String[] args){
        try {
            File fileOp=new File("C:\\Users\\Zain Sharjeel\\OneDrive\\Desktop\\zainiba.txt");
            if (!Desktop.isDesktopSupported()){
                System.out.print("Desktop not supported");
                return;
            }
            Desktop desktop=Desktop.getDesktop();
            if (fileOp.exists()){
                desktop.open(fileOp);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}


package inandout;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Writer {
    
    public void writechar(){
        try {
            FileOutputStream fos = new FileOutputStream("In.txt");
            fos.write(65);
            fos.flush();
            fos.close();
            System.out.println("Kész");
        } catch (Exception ex) {
            Logger.getLogger(" "+ex);
        }
    }
    public void write(){
        try {
            FileOutputStream fos = new FileOutputStream("In.txt");
            String text = "First real java software";
            byte a[] = text.getBytes();
            fos.write(a);
            fos.flush();
            fos.close();
        } catch (Exception ex) {
            Logger.getLogger(" "+ex);
        }
    }
}

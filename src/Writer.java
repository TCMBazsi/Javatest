
package inandout;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.logging.Logger;

public class Writer {
    public void write(){
        try {
            FileOutputStream fos = new FileOutputStream("In.txt");
            String text = "First real java software";
            byte a[] = text.getBytes();
            fos.write(a);
            fos.flush();
            fos.close();
            System.out.println("Kész vagyok");
        } catch (Exception ex) {
            Logger.getLogger(" "+ex);
        }
    }
    public void buffer(){
        try {
            FileOutputStream fos = new FileOutputStream("In.txt");
            BufferedOutputStream bf = new BufferedOutputStream(fos);
            String text = "First real java software";
            byte a[] = text.getBytes();
            fos.write(a);
            fos.flush();
            fos.close();
            System.out.println("Kész vagyok");
        } catch (Exception ex) {
            Logger.getLogger (" "+ex);
        }
    }
}


package inandout;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;

public class Reader {
     public void readchar() {
        try {
            try (FileInputStream fis = new FileInputStream("In.txt")) {
                int i = fis.read();
                System.out.println((char)i);
            }
        } catch (IOException ex) {
            Logger.getLogger("" +ex);
        }    
    }
     
    public void Read(){
         try {
             FileInputStream fis = new FileInputStream("In.txt");
             int i = 0;
             String result = "";
             while((i=fis.read())!= -1){
                 result += (char) i;
             }
               System.out.println(result);
               fis.close();
             } catch (Exception ex) {
             Logger.getLogger(" " + ex);
         }
    }
}

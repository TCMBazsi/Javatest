
package inandout;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.logging.Logger;

public class Reader {
    public void buffer(){
         try {
              FileInputStream fis = new FileInputStream("In.txt");
              BufferedInputStream bf = new BufferedInputStream(fis);
              int c = 0;
              String x = "";
               while((c=bf.read())!= -1){
                 x += (char) c;
              } 
              System.out.println(x);
              fis.close();
         }
         catch (Exception ex){
         Logger.getLogger(" " + ex);   
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


package inandout;

import java.io.IOException;

public class Main {

    public static void main(String[] args){
        Writer w = new Writer();
        Reader r = new Reader();
        r.Read();
        w.write();
    }
    
}

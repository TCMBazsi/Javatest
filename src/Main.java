
package inandout;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Writer w = new Writer();
        Reader r = new Reader();
        w.buffer();
        r.buffer();
    }
    
}

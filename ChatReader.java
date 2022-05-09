package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ChatReader implements Runnable {
    private BufferedReader reader;

    public ChatReader(InputStream is) {
        this.reader = new BufferedReader(new InputStreamReader(is));
    }

    @Override
    public void run() {
        char[] chars = new char[200];
        while (true) {
            try {
                if (this.reader.read(chars) != -1)  {

                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

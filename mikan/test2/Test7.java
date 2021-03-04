package mikan.test2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test7 {
    public static void main(String[] args) {
        Test7 t7 = new Test7();
        try {
            t7.test();
            t7.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Writer w;
    {
        try {
            w = new FileWriter("Test1.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void test()throws IOException{
        w.write("ま゛");
        for(int i = 0; i < 100; i++){
            StringBuilder sb = new StringBuilder();
            for(int i1 = 0; i1 < 1000; i++){
                sb.append("ぅ゛");
            }
            w.write(sb.toString());
        }
    }
    public void close()throws IOException{
        w.flush();
        w.close();
    }
}
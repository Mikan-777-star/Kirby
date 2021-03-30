package mikan.test3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= Character.MAX_VALUE; i++){
            sb.append((char)i).append(" ");
            if(i % 30 == 0)sb.append('\n');
        }
        try(Writer w = new FileWriter("Test2.txt")){
            w.write(sb.toString());
            w.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

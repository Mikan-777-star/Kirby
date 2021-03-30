package mikan.test3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test1{
    public static void main(String[] args) {
        String chars = "utf-8";
        try(InputStream is = new FileInputStream("Test1.txt")){
            byte[] b = new byte[1024];
            int i;
            while((i = is.read(b, 0, 1024)) != -1){
                System.out.print(new String(b, 0, i, chars));
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
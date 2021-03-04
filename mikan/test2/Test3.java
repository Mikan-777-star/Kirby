package mikan.test2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;


public class Test3 {
    private static List<Integer> list = new ArrayList<>();
    static{
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        for(int i = 11; list.size() < Character.MAX_VALUE; i++){
            boolean b = true;
            for(int i1 : list){
                if(i % i1 == 0){
                    b = false;
                    break;
                }
            }
            if(b)list.add(i);
        }
    }
    public static void main(String[] args) {
        try(OutputStream os = new BufferedOutputStream(new FileOutputStream("Prime_Number.txt"))){
            int i = 0;
            for(int i1:list){
                os.write(String.valueOf(i1).getBytes());
                if (i == 10) {
                    os.write('\n');
                    i = 0;
                } else {
                    os.write(' ');
                    i++;
                }
            }
            os.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

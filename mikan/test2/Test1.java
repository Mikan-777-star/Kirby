package mikan.test2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();
        list.add(0L);
        list.add(1L);
        for(int i = 1; i < 47; i++)list.add(list.get(i - 1) + list.get(i));
        try(OutputStream os = new BufferedOutputStream(new FileOutputStream("result.log"))){
            StringBuilder sb = new StringBuilder();
            list.stream().forEach(i -> sb.append(String.valueOf(i.intValue())).append('\n'));
            os.write(sb.toString().getBytes());
            os.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

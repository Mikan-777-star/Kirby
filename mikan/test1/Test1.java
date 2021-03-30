package mikan.test1;

import java.io.IOException;
import java.io.OutputStream;

public class Test1{
    public static void main(String[] args) {
        args = mikan.tester.Test.args_test(args, 2);
        test t = new test(args[0], Integer.valueOf(args[1]));
        try (OutputStream os = new java.io.FileOutputStream("result.log", true)) {
            t.write(System.out);
            t.write(os);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class test{
    private final Chara c;
    private final int length;
    private String result;

    test(String str ,int len){
        c = Chara.get(str);
        length = len;
        result = this.result();
    }

    private String result(){
        //System.out.println(c.table);
        //System.out.println(c.len);
        StringBuffer sb = new StringBuffer("result -> ");
        java.util.Arrays.stream(new int[this.length]).parallel()
        .map(i -> c.table[(int)(Math.random() * c.len)])
        .forEach(i ->{
            synchronized(sb){
                sb.append((char)i);
            }
        });
        return sb.toString();
    }
    public void write(OutputStream os) throws IOException{
        os.write(result.getBytes());
        os.write('\n');
        os.flush();
    }

    enum Chara{
        ALL("QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890_*<>/\\\"'+-;:,.][{}|#$%&'()?!"), 
        Number("1234567890"), 
        Character("QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890");
        char[] table;
        int len;
        Chara(String str){
            this.table = str.toCharArray();
            len = str.length();
        }
        static Chara get(String str){
            if("ALL".equals(str))return ALL;
            if("Number".equals(str))return Number;
            if("Character".equals(str))return Character;
            throw new IllegalArgumentException("不明な引数です。");
        }
    }
}
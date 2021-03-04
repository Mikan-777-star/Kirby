package mikan.tester;

import java.util.*;

public class Test {
    public static String TEST = "みかん 桃 シャミ子 リリス 良 小倉 清子 杏里 おっち みなみ にゃが つるちゃん リコ君 店長 紅さん 浅瀬先生 誰何 桜 ヨシュアパパ 魔法少女☆　アグニカカイエル ダークライ ";
    public static String[] args_test(String[] args, int i) {
        if(args.length >= i)return args;
        return args_test(test(readLine()), i);
    }
    public static String readLine() {
        String s = null;
        try {
            char[] c = new char[1024];
            int len = new java.io.InputStreamReader(System.in).read(c,0,c.length);
            if(c[len - 1] == '\n')len--;
            if(c[len - 1] == '\r')len--;
            char[] c1 = new char[len];
            System.arraycopy(c, 0, c1, 0, c1.length);
            s = new String(c1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(s == null)System.exit(-1);
        return s;
    }
    public static String[] test(String s) {
        List<String> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(s, " ");
        while(st.hasMoreTokens())list.add(st.nextToken());
        return list.toArray(new String[list.size()]);
    }
    public static void main(String[] args) {
        Object o = new Object();
        Arrays.stream(test(TEST)).forEach(s ->{
            s.chars().forEach(i ->{
                synchronized(o){
                    try {
                        o.wait(50L);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.print((char)i);
            });
            System.out.println();
        });
    }
}

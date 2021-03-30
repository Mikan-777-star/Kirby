package mikan.test2;

import java.util.StringTokenizer;

public class Test9 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("27ｘ26980ｘ56562ｘ15","ｘ");
        long l1 = 1L;
        while(st.hasMoreTokens()){
            l1 *= Integer.valueOf(st.nextToken());
        }
        System.out.println(l1);
    }
}

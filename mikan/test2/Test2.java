package mikan.test2;

import java.util.StringTokenizer;

public class Test2 {
    public static void main(String[] args) {
        String s = mikan.tester.Test.TEST;
        StringTokenizer st = new StringTokenizer(s, " ");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}

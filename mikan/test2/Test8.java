package mikan.test2;

import java.util.Arrays;

public class Test8{
    public static void main(String[] args) {
        if(args.length < 3){
            System.err.println("コマンドラインで引数を指定してください");
            System.exit(-1);
        }
        StringBuffer sb = new StringBuffer(args[0]);
        Arrays.stream(new String[Integer.valueOf(args[2])]).parallel()
        .map(i -> args[1])
        .forEach(i -> {
            synchronized(sb){
                sb.append(i);
            }
        });
        System.out.println(sb);
    }
}
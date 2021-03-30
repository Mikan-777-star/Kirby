package mikan.test2;

import java.util.function.IntToDoubleFunction;

public class Chiyoda_Shitagi{
    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("コマンドラインで引数を指定してください");
            System.exit(-1);
        }
        IntToDoubleFunction iuo;
        var test = Integer.valueOf(args[1]);
        if(Boolean.valueOf(args[0])){
            iuo = i -> i / 26980.0;
        }else{
            iuo = i -> i * 26980;
        }
        System.out.println(Double.toString(iuo.applyAsDouble(test)));
    }
}
package mikan.tester;

public class Math {
    public static int random(int max){
        if(max < 0)throw new IllegalArgumentException("引数にマイナスは指定出来ません");
        return (int)(java.lang.Math.random() * max);
    }
    private Math(){}
}

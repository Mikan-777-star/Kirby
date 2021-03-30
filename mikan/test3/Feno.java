package mikan.test3;

public class Feno {
    public static void main(String[] args) {
        if(args.length < 1){
            System.err.println("コマンドラインで引数を指定してください");
            System.exit(-1);
        }
        int time = 0;
        try{
            time = Integer.valueOf(args[0]);
        }catch(Exception e){
            e.printStackTrace();
        }
        if(time < 1)System.exit(0);
        Object lock = new Object(){};
        System.out.println("抜きます");
        synchronized(lock){
            try {
                lock.wait(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("抜きました");
    }
}

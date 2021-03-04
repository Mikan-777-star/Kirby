package mikan.test1;

import java.time.*;

public class Test3 {
    public static void main(String[] args) {
        Object lock = new Object();
        while (true) {
            synchronized (lock) {
                try {
                    lock.wait(1000L * 59);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            var time = LocalTime.now();
            if(time.getMinute() == 0){
                try{
                    test1();
                    synchronized(lock){
                        lock.wait(60000 * 58);
                    }
                }catch(Exception e){
                    e.printStackTrace();
                    break;
                }
            }
        }
    }
    private static void test1() throws Exception {
        var time = LocalDateTime.now();
        try(java.io.OutputStream os = new java.io.FileOutputStream("BotResult.log", true)){
            Test2.getBot();
            String s = new StringBuilder("GET").append(time.toString()).append('\n').toString();
            os.write(s.getBytes());
            os.flush();
        }catch(Exception e){
            throw e;
        }
    }
}

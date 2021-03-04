package mikan.test1;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test2 {
    public static void getBot() {
        StringBuilder sb = new StringBuilder("bot\\niconico-ranking-");
        append_time(sb);
        getURL("https://www.nicovideo.jp/ranking/genre/all?rss=2.0&lang=ja-jp", sb.append(".xml").toString());
    }
    private static void getURL(String url,String saved){
        try(InputStream is = new java.net.URL(url).openStream();
        OutputStream os = new FileOutputStream(saved)){
            byte[] b = new byte[1024];
            int i;
            while((i = is.read(b, 0, 1024)) != -1)os.write(b, 0, i);
            os.flush();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private static void append_time(StringBuilder sb){
        var time = java.time.LocalDateTime.now();
        int[] now = new int[5];
        now[0] = time.getYear();
        now[1] = time.getMonthValue();
        now[2] = time.getDayOfMonth();
        now[3] = time.getHour();
        now[4] = time.getMinute();
        for(int i : now)sb.append(String.valueOf(i));
    }
}

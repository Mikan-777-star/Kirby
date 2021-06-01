package java;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Test1 {
    public static void main(String[] args) {
        try(Socket socket = new Socket("xaymwmdybz.duckdns.org", 80)){
            OutputStream os = new BufferedOutputStream(socket.getOutputStream());
            InputStream is = new BufferedInputStream(socket.getInputStream());
            os.write("HTTP/1.1 / POST\r\n".getBytes());
            os.write("Host: xaymwmdybz.duckdns.org".getBytes());
            os.write("Connection: close\r\n".getBytes());
            os.write("user-agent: お前ら/馬鹿か\r\n".getBytes());
            os.flush();
            byte[] b = new byte[1024];
            int i ;
            while((i = is.read(b))!=-1){
                System.out.print(new String(b, 0, i, "utf-8"));
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

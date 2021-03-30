import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test1{
    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("コマンドラインで引数を指定してください");
            return;
        }
        String chars = "utf-8";
        try(InputStream is = new FileInputStream(args[0]);OutputStream os = System.out){
            byte[] b = new byte[1024];
            int i;
            while((i = is.read(b, 0, 1024)) != -1){
                os.write(new String(b, 0, i, chars).getBytes());
            }
            os.flush();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
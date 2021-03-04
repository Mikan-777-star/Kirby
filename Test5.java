import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test5{
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            (br = new BufferedReader(new FileReader("Prime_Number.txt"))).lines().forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                br.close();
            } catch (IOException e) {}
        }
    }
}
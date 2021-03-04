
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test4 {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        try (Scanner sin = new Scanner(System.in)) {
            for(int i = 0;sin.hasNextInt();i++)map.put(sin.nextInt(), i);
        }
        StringTokenizer st = new StringTokenizer("133033 132439 133261 137 308587 137 133691 134227 134191 266837 137 134293 134293 133709 137 393901 137 269041 230597 137 327007 266837 137 305471 444739 137 132437 132701 132689 137 133033 132757 133033 137 132761 133073 132469 137 132707 133157 132689 133073 133261 137 134293 133649 243809 137 277169 457279 137 376199 132547 133261 137 324641 333973 234743 350093 137 421493 228581 137 308939 137 134287 133691 134257 133403 134039 134039 137 476759 323201 269063 260849 101653 131543 133403 133597 133967 133541 133541 133439 133493 134327 137 133801 134507 133583 134291 133439 137");
        List<Integer> list = new ArrayList<>();
        while(st.hasMoreTokens())list.add(Integer.valueOf(st.nextToken()));
        list.stream().mapToInt(map::get).forEach(i -> System.out.print((char)i));
    }
}

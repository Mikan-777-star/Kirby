package mikan.test2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Test4 {
    public static void main(String[] args) {
        int[] prime_number = new int[Character.MAX_VALUE];
        try(Scanner scanner = new Scanner(new FileInputStream("Prime_Number.txt"))){
            int i = 0;
            while(prime_number.length > i && scanner.hasNextInt())prime_number[i++] = scanner.nextInt();
        }catch(IOException e){
            e.printStackTrace();
        }
        String test = "パインアメマン";
        double i1 = 1;
        int[] i2 = test.chars().map(i -> prime_number[i]).toArray();
        for(int i : i2)i1 *= i;
        i1 *= 7;
        System.out.println(i1);
    }
}

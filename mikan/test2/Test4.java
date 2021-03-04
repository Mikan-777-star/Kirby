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
        String test = mikan.tester.Test.TEST;
        StringBuilder sb = new StringBuilder();
        test.chars().map(i -> prime_number[i]).forEach(i -> sb.append(i).append(' '));
        System.out.println(sb);
    }
}

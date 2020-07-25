

import java.util.Random;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
    Random random = new Random();

    Scanner Scanner = new Scanner(System.in);
    int h = Scanner.nextInt();
    int count=1;
        for( ; ; ){
            int x = random.nextInt( 100 );
        if( x==h){
            System.out.println("trung ngau nhien = " + x + "="+ h);
            System.out.println(" so buoc thuc hien la" + count +"buoc");
            break;
        }
            System.out.println(x);
            count++;
    }

    }
}
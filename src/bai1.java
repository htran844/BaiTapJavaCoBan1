

import java.util.Scanner;


public class bai1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu rong: ");
        int a = Scanner.nextInt();
        System.out.println("Nhap vao chieu cao: ");
        int b = Scanner.nextInt();
        int i, j = 0;
        for (i=0; i< b; i++){
            System.out.println("");
            for (j=0; j<a; j++){
                System.out.printf(" * ");
            }
        }


    }
}

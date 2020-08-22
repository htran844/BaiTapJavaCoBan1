
import java.util.Scanner;
/*
Tinh tong cac chu so cua mot so nguyen bat ky
 */

public class bai10 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so nguyen bat ky ");
        Scanner Scanner = new Scanner(System.in);
        int n = Scanner.nextInt();
        int sum=0, du=0;
        while(n>0){
            du = n%10;
            n = n/10;
            sum += du ;
        }
        System.out.println(" tong cac chu so = " + sum);
    }
}

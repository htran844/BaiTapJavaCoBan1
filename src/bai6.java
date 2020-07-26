
import java.util.Scanner;

public class bai6 {
    public static void main(String[] args){
        System.out.println("Nhap vao so n:");
        Scanner Scanner = new Scanner(System.in);
        int n = Scanner.nextInt();
        int count = 0;
        if( n%2 == 0){
            for(int i =2; i<=n; i += 2){
                count = count + i ;
            }
            System.out.println("gia tri cua tong la = " + count);
        }else {
            for(int i =1; i<=n; i += 2){
                count = count + i ;
            }
            System.out.println("gia tri cua tong la = " + count);

        }
    }
}

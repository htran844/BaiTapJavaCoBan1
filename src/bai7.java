
import java.util.Scanner;

public class bai7 {
    public static void main(String[] args){
        System.out.println("Nhap vao so n:");
        Scanner Scanner = new Scanner(System.in);
        int n = Scanner.nextInt();
        float count = 0;
        for(int i = 1; i<= n ; i++){

            count += (float)1/i ;
        }
        System.out.println("tong la = " + count);



    }

    }

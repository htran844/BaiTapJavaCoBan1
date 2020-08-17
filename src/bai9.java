import java.util.Scanner;

public class bai9 {
    public static void main(String[] args){
        System.out.println("Nhap vao so n= ");
        Scanner Scanner = new Scanner(System.in);
        int n = Scanner.nextInt();
        int soDu,  count = 0;
       while (n>0){
           soDu = n%10;
           n=n/10;
           count += soDu;
       }
        System.out.println("tong cua no la= " + count);

    }
    }
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu rong: ");
        int a = Scanner.nextInt();
        System.out.println("Nhap vao chieu dai: ");
        int b = Scanner.nextInt();
        int i, j = 0;
        for(i=0; i<=b; i++){
            System.out.println();
            for(j=0; j<=a; j++){
                if(i>0 && i<a && j>0 && j<b){
                    System.out.printf("   ");
                } else System.out.print(" * ");
            }
        }
    }
}

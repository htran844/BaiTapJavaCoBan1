
import java.util.Scanner;

public class fibonaci12 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so n= ");
        Scanner Scanner= new Scanner(System.in);
        int n= Scanner.nextInt();
        int f0=0, f1=1, fn=0;
        for (int i=0; i< n; i++){
            if(i<2) {
                System.out.println(i);
            }else {
                fn=f0+f1;
                f0=f1;
                f1=fn;
                System.out.println(fn);

            }
        }
    }
}

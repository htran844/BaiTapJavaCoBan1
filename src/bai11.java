
import java.util.Scanner;


public class bai11 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so nguyen duong n =");
        Scanner Scanner = new Scanner(System.in);
        int n = Scanner.nextInt();
        int i = 2;
        while (n != 1) {
            if (n % i == 0) {
                System.out.print(i + "x");
                n = n / i;
            } else i++;
        }
        System.out.print("\b"); //chu y: \b la xoa bo mot ki tu
    }
}

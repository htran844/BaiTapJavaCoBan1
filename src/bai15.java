import java.util.Scanner;
// tinh so pi
public class bai15 {
    public static void main(String[] args) {
        double c;
        System.out.println("nhap vao so c> 0 ");
        Scanner scanner = new Scanner(System.in);
        c = scanner.nextDouble();

        int n = 0;
        double x = 1.0 / (2 * n + 1);
        double pi= 0;
        while (c <= x) {

            pi = pi+  Math.pow(-1, n) * x;
            n++;
            x = 1.0 / (2 * n + 1);

        }
        pi *= 4;
        System.out.println(pi);
    }
}

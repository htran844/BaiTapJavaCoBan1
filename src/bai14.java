import java.util.Scanner;
// tim so luong so chinh phuong

public class bai14 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Nhap so m va n lan luot vao");
        int m = Scanner.nextInt();
        int n = Scanner.nextInt();
        int count = 0;
        int k = 0;
        if (n > m && n > 0) {
            for (int i = m; i < n; i++) {

                int scp = (int) Math.sqrt(i);
                if (scp * scp == i) {
                    System.out.printf("%10d", i);
                    count++;
                    k++;
                }
                if (k % 10 == 0) {
                    System.out.println();

                }


            }
            System.out.println();
            System.out.println("so luong so chinh phuong la " + count);
        }
    }
}

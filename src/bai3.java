import java.util.Scanner;
import java.util.jar.JarOutputStream;
/* tim dieu kien de in ra
i+j>4
i=1;j=1 khoang trong
i=1,j=3 khoang trong
i=1, j=5 ->in ra khoang trong
i=3, j=7 -> in ra khoang trong
i=3, j=2,3,4,5,6 -> co in ra
i=2, j=3,4,5 co in ra
suy ra i+j>=h+1
j-h>=1-i
h-j<=i-1
tim gia tri de in ra
i=2,j=2 in ra khoang trong
i=2, j=3,4,5 in ra -4+i+j
i=3, j=2 in ra -4+i+j
i=4, j=1 in ra -4+i+j -> in ra -4+i+j
i=3, j=3 in ra -4+i+j|  i- (4-j)
i=4, j=3 in ra -4+i+j
i=3, j=4 in ra -4+i+j
i=3, j=6 in ra -4+i+j   i-|4-j|

 */
public class bai3 {
    public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
    int h = Scanner.nextInt();
    int i, j;
    for (i=0; i<=h; i++){ //vong for xuong hang
        for (j=0; j<2*h; j++){
            if (Math.abs(h-j) <= i-1){ // i+j>=h+1 sau do chuyen ve doi dau se ra
                System.out.print(i-Math.abs(h-j)); // -h+i+j gop lai dat tri tuyet doi de j khi >h van duong
            } else System.out.print(" ");
        }
        System.out.println();
    }
    }
    }


package Lab01;
import java.util.Scanner;
public class Bai6_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc ma tran: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        int c[][] = new int[m][n];
        System.out.printf("Nhap ma tran A[%d][%d]: ", m, n);
        System.out.println();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.printf("Nhap ma tran B[%d][%d]: ", m, n);
        System.out.println();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                b[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Nhap ma tran C = A+B: ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}

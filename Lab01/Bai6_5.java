package Lab01;
import java.util.Arrays;
import java.util.Scanner;
public class Bai6_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Nhap cac phan tu cua mang: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        long sum = Arrays.stream(arr).sum();
        System.out.println();
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (double)sum/n);
    }
}

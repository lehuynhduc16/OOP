package Lab01;
import java.util.Scanner;
import java.lang.Math;
import static java.lang.Boolean.TRUE;

public class Bai2_6 {
    public static Scanner sc = new Scanner(System.in);
    public static int n;
    //Phuong trinh bac nhat ax+b=0
    public static void phuongTrinhBacNhat(){
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if(a==0 && b==0){
            System.out.print("Phuong trinh vo so nghiem");
        }
        else if(a==0 && b!=0){
            System.out.print("Phuong trinh vo nghiem");
        }
        else{
            double x = -b/a;
            System.out.print("Phuong trinh co nghiem: " + x);
        }
    }

    //He phuong trinh bac nhat 2 an a1x+b1y=c1 & a2x+b2y=c2
    public static void hePhuongTrinh(){
        double a1 = sc.nextDouble();
        double b1 = sc.nextDouble();
        double c1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        double b2 = sc.nextDouble();
        double c2 = sc.nextDouble();
        double D = a1*b2 - a2*b1;
        double Dx = c1*b2 - c2*b1;
        double Dy = a1*c2 - a2*c1;
        if (D==Dx && D==Dy){
            System.out.print("Phuong trinh co vo so nghiem");
        }
        else if(D==0 && Dx!=0 && Dy!=0){
            System.out.print("Phuong trinh vo nghiem");
        }
        else{
            double x = Dx/D;
            double y = Dy/D;
            System.out.printf("Phuong trinh co nghiem: (" + x + ", " + y + ")");
        }
    }

    //Phuong trinh bac 2 ax^2+bx+c=0
    public static void phuongTrinhBac2(){
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double delta = b*b-4*a*c;
        if(delta<0){
            System.out.print("He phuong trinh vo nghiem");
        }
        if(delta==0){
            double x = -b/(2*a);
            System.out.print("He phuong trinh co nghiem duy nhat x = " + x);
        }
        if(delta>0){
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b + Math.sqrt(delta))/(2*a);
            System.out.println("He phuong trinh co 2 nghiem phan biet: ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }

    public static void main(String[] args) {
        System.out.println(" _______________MENU________________");
        System.out.println("|(1) Phuong trinh bac nhat          |");
        System.out.println("|(2) He phuong trinh bac nhat 2 an  |");
        System.out.println("|(3) Phuong trinh bac 2             |");
        System.out.println("|___________________________________|");
        System.out.println();
        while(TRUE){
            System.out.print("Chon 1, 2 hoac 3: ");
            n = sc.nextInt();
            if(n==1 || n==2 || n==3)
                break;
        }
        switch (n){
            case 1:
                phuongTrinhBacNhat();
                break;
            case 2:
                hePhuongTrinh();
                break;
            case 3:
                phuongTrinhBac2();
                break;
        }
    }
}

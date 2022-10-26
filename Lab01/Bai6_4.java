package Lab01;
import java.util.Scanner;
public class Bai6_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input month: ");
        String m = sc.nextLine();
        System.out.print("Input year: ");
        int y = sc.nextInt();

        if (m.equals("January") ||m.equals("Jan") || m.equals("Jan.") || m.equals("1")
                || m.equals("March") || m.equals("Mar") || m.equals("Mar.") || m.equals("3")
                || m.equals("May") || m.equals("5")
                || m.equals("July") || m.equals("Jul") || m.equals("7")
                || m.equals("August") || m.equals("Aug") || m.equals("Aug.") || m.equals("8")
                || m.equals("October") || m.equals("Oct") || m.equals("Oct.") || m.equals("10")
                || m.equals("December") || m.equals("Dec") || m.equals("Dec.") || m.equals("12")){
            System.out.print("31");
        }
        else if (m.equals("April") || m.equals("Apr") || m.equals("Apr.") || m.equals("4")
                || m.equals("June") || m.equals("Jun") || m.equals("6")
                || m.equals("September") || m.equals("Sept.") || m.equals("Sep") || m.equals("9")
                || m.equals("November") || m.equals("Nov.") || m.equals("Nov") || m.equals("11")){
            System.out.print("30");
        }
        else if((m.equals("February") || m.equals("Feb.") || m.equals("Feb") || m.equals("2")) && y%4==0 && y%100!=0){
            System.out.print("29");
        }
        else{
            System.out.print("28");
        }
    }
}

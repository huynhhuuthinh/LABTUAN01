package LABTUAN1;
import java.util.Scanner;
public class Bai10 {
    public static void main(String[] args) { 
        Scanner HT= new Scanner(System.in);
        System.out.println("nhap so");
        int so = HT.nextInt();
        int mau =1 ;
        while (true) {
            so = so/10;
            mau ++;
            if (so < 10){
                break;
            }
        }
        System.out.println("tổng chữ số: " + mau);
}
}

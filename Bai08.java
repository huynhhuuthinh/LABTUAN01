package LABTUAN1;
import java.util.Scanner;
public class Bai08 {
    public static void main(String[] args) {
        Scanner HT= new Scanner(System.in);
        int so, socuoi;
        while (true) {
            System.out.print("Nhập số bất kì:");
         so = HT.nextInt();
            if (so > 0) {
                break;
            }
            else {
                System.out.println("Nhập số dương");
            }
        }
        socuoi = so%10;
        while (so >= 10) {
             so /= 10;
        }
        System.out.println("Số đầu là: " + so);
        System.out.println("Số cuối là: " + socuoi);
}
}

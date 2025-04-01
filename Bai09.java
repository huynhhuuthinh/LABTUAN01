package LABTUAN1;
import java.util.Scanner;
public class Bai09 {
    public static void main(String[] args) { 
        Scanner HT= new Scanner(System.in);
        int so, mau1, mau2, tong, tich;
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
tong= 0;
mau1= so;
while (so > 0) {
    tong += mau1 % 10; 
    mau1 /= 10;

}
tich= 1;
mau2= so;
while (so > 0) {
    tich *= mau2 % 10; 
    mau2 /= 10;       
}
System.out.println("Tổng là: " + tong);
System.out.println("Tích là: " + tich);
}
}

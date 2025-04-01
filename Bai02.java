package LABTUAN1;
import java.util.Scanner;
public class Bai02 {
    public static void main(String[] args){
        Double dai, rong;
        Scanner HT= new Scanner(System.in);
        System.out.println("Nhap chieu dai= ");
        dai= HT.nextDouble();
        System.out.println("Nhap chieu rong= ");
        rong=HT.nextDouble();
        Double dientich= dai*rong;
        System.out.println("Dien tich hinh chu nhat la: " + dientich);
    }
}


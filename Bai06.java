package LABTUAN1;
import java.util.Scanner;
public class Bai06 {
    public static void main(String[] args) {
        Double canh1, canh2, canh3 ;
        Scanner HT= new Scanner(System.in);
        System.out.println("Nhap do dai canh thu nhat:");
        canh1 = HT.nextDouble();
        System.out.println("Nhap do dai canh thu hai:");
        canh2 = HT.nextDouble();
        System.out.println("Nhap do dai canh thu ba:");
        canh3 = HT.nextDouble();
        if (canh1 + canh2 > canh3) {
            System.out.println("day la tam giac hop le");
        }
        else if (canh1 + canh3 > canh2) {
            System.out.println("day la tam giac hop le");
        }
        else if (canh2 + canh3 > canh1) {
            System.out.println("day la tam giac hop le");
        }
        else {
            System.out.println("day khomg phai la tam giac hop le");
        }
}
}
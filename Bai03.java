package LABTUAN1;
import java.util.Scanner;
public class Bai03 {
    public static void main(String[] args){
        Double c,f;
        Scanner HT= new Scanner(System.in);
        System.out.println("Nhap do F= ");
        f= HT.nextDouble();
        c=(f-32)/1.8;
        System.out.println("Do C =  " + c);
}
}

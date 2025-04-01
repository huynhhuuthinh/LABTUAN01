package LABTUAN1;
import java.util.Scanner;
public class Bai05 {
    public static void main(String[] args) {
    Scanner HT= new Scanner(System.in);
    int[] a =  new int[3];
    System.out.println("Nhap so thu nhat:");
    a[0] = HT.nextInt();
    System.out.println("Nhap so thu hai:");
    a[1] = HT.nextInt();
    System.out.println("Nhap so thu ba:");
    a[2] = HT.nextInt();
    int g= a[0];
    for(int i=1; i<a.length-1; i++){
        if(a[i] < g){
            g=a[1];
        }
    }
        System.out.println("So nho nhat la: "+g);
}
}

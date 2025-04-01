package LABTUAN1;
import java.util.Scanner;
public class Bai04 {
    public static void main(String[] args) {
        int year;
        Scanner HT= new Scanner(System.in);
        System.out.println("Nhap nam ban muon kiem tra:");
        year = HT.nextInt();
            if (year % 4 == 0) {
                if(year % 100 == 0){
                if( year % 400 == 0){
                    System.out.println("Nam " + year + " la nam nhuan");   
                }
                else{
                    System.out.println("Nam " + year + " khong la nam nhuan"); 
                }
                }
                else{
                    System.out.println("Nam " + year + " khong la nam nhuan");
                }
            }
            else{
                System.out.println("Nam " + year + " khong la nam nhuan");
            }

}
}

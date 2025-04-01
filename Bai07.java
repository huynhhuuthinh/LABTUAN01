package LABTUAN1;
import java.util.Scanner;
public class Bai07 {
    public static void main(String[] args) {
        Scanner HT= new Scanner(System.in);
        String[] mon = {"Lý", "Hóa", "Sinh", "Toán", "Máy Tính"};
        Double[] diem = new Double[5];
        for(int i = 0; i<5; i++){
            while (true) {
                System.out.print("Nhập điểm môn " + mon[i] + ":");
                double diemm = HT.nextDouble();
                if (diemm >= 0 && diemm <= 10) {
                    diem[i] = diemm;
                    break;
                }
                else {
                    System.out.println("Điểm không hợp lệ! Chỉ nhập từ 0 đến 10.");
                }
            }
        }
        Double tong= diem[1] + diem[2] +diem[3] + diem[4] + diem[5];
        Double tile= tong/5*10;
        if (tile > 90) {
            System.out.println("Xếp loại A");
        }
        else if (tile >80) {
            System.out.println("Xếp loại B");
        }
        else if (tile >70) {
            System.out.println("Xếp loại C");
        }
        else if (tile >60) {
            System.out.println("Xếp loại D");
        }
        else if (tile >=40) {
            System.out.println("Xếp loại E");
        }
        else{
            System.out.println("Xếp loại F");
        }

}
}
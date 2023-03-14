import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] canChi = {"Giáp Tý", "Ất Sửu", "Bính Dần", "Đinh Mão", "Mậu Thìn", "Kỷ Tỵ",
                "Canh Ngọ", "Tân Mùi", "Nhâm Thân", "Quý Dậu", "Giáp Tuất", "Ất Hợi"};

        System.out.println("Nhập số tuổi của bạn vào đây:");
        int age = sc.nextInt();
        System.out.println("Nhập năm hiện tại vào đây:");
        int nowYear = sc.nextInt();


        int nowCan = (nowYear - 4) % 10;
        int ageCan = age % 10;
        int index = (nowCan + ageCan) % 12;
        System.out.println("Can chi của bạn là: "+ canChi[index]);


    }
}

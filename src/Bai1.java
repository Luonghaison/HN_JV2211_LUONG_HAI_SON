import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] listCan = {"Canh", "Tân", "Nhâm", "Quý", "Giáp", "Ất", "Bính", "Đinh", "Mậu", "Kỷ"};
        String[] listChi = {"Thân", "Dậu", "Tuất", "Hợi", "Tý", "Sửu", "Dần", "Mão", "Thìn", "Tỵ", "Ngọ", "Mùi"};

        System.out.println("Nhập số tuổi của bạn vào đây:");
        int age = sc.nextInt();
        int birthYear = 2023 - age;

        int canIndex = (birthYear-1)%10+1;
        if(canIndex==10){canIndex=0;}
        int chiIndex = (birthYear-1)%12+1;
        if(chiIndex==12){chiIndex=0;}


        String can = listCan[canIndex];
        String chi = listChi[chiIndex];

        System.out.println("Bạn năm nay " +age+ " tuổi thì Can chi của bạn là: "+can+" "+chi);


    }
}

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương n vào đây: ");
        int number = sc.nextInt();

        int sum = 0;
        for (int i = 0; i <= number; i += 2) {
            sum += i;
        }
        System.out.println("Tổng tất cả các số nguyên dương chẵn từ 0 đến "+number+" là "+ sum);

    }
}

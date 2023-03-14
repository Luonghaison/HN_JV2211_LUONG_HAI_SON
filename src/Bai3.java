import java.util.Arrays;

public class Bai3 {
    public static void main(String[] args) {
        //tạo mảng chứa 50 phần tử
        int arr[] = new int[50];
        //viết chương trình random mảng  số ngẫu nhiên từ 1 đến 100:
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }
        //In ra mảng ban đầu
        System.out.println("Mảng 50 phần tử số nguyên bất kỳ là: ");
        System.out.println(Arrays.toString(arr));

        //Tìm giá trị min,max của mảng
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("Giá trị lớn nhất của mảng trên là: " + max);
        System.out.println("Giá trị nhỏ nhất của mảng trên là: " + min);

        //Sắp xếp mảng tăng dần và in mảng sau khi sắp xếp ra:
        Arrays.sort(arr);
        System.out.println("Mảng mới sau khi sắp xếp tăng dần là: ");
        System.out.println(Arrays.toString(arr));


        //Đếm số lần xuất hiện các số nguyên tố trong mảng,tạo 1 biến đếm count chạy vòng for và truyền đối số arr[i] vào hàm isPrime và cứ khi hàm đc chạy thì biến đếm tăng lên 1 đơn vị
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                count++;
            }
    }
        System.out.println("Số lần xuất hiện các số nguyên tố trong mảng là: "+ count);

    }
    //tạo 1 hàm boolean trả về true false để kiểm tra xem n có phải số nguyên tố ko
    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

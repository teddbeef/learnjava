import java.util.Scanner;

public class Bai10_Scanner {
    public static void main(String[] args) {
        //khởi tạo 1 đối tượng Scanner
        Scanner sc = new Scanner(System.in);

        //Cho phép nhập chuỗi
        System.out.println("Mời nhập vào mk cấp 1: ");
        String mk1 = sc.nextLine();
        System.out.println("Mk cấp 1: "+mk1);
        //nhập số nguyên
        System.out.println("Mời nhập vào số nguyên A: ");
        int a = sc.nextInt();
        System.out.println("Số nguyên A: "+a);
        //nhập số float
        System.out.println("Mời nhập vào số thực  X: ");
        float x = sc.nextFloat();
        System.out.println("Số thực X: "+x);
        //Cho phép nhập chuỗi
        System.out.println("Mời nhập vào mk cấp 2: ");
        String mk2 = new Scanner(System.in).nextLine(); //for can enter value
        System.out.println("Mk cấp 2: "+mk2);

        sc.close();
    }
}

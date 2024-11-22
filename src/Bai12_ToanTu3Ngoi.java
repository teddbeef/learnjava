import java.util.Scanner;

public class Bai12_ToanTu3Ngoi {
    public static void main(String[] args) {
        String result;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number that you wanna check: ");
        int n = sc.nextInt();
        /*Công thức toán tử 3 ngôi
           ? đúng
           : sai
         */
        result = (n%2==0) ? "Chẳn" : "Lẻ";
        System.out.println("Your number entered is " + result);
    }
}

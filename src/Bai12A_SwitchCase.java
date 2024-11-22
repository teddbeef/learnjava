import java.util.Scanner;

public class Bai12A_SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        double a = sc.nextDouble();
        double result = a%2;
        switch ((int) result)
        {
            case 0:
                System.out.println("Number is Chan");
                break;
            default:
                System.out.println("Number is Le");
                break;
        }

        //Switch Case biến thể
        System.out.println("Enter your month: ");
        int mt = sc.nextInt();
        switch (mt){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Your month have 31 days");
                break;
            case 2:
                System.out.println("Your month have 28 or 29 days");
                break;
            default:
                System.out.println("Your month have 30 days");
                break;

        }
    }
}

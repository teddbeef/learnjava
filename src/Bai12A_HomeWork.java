import java.util.Scanner;

public class Bai12A_HomeWork {
    public static void main(String[] args) {
        int choice;
        System.out.println("Please enter your number you want to do");
        System.out.println("1. Search the name");
        System.out.println("2. Search the Artist");
        System.out.println("3. Search the Producer");
        System.out.println("4. Search the Subject");

        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Search the name");
                break;
            case 2:
                System.out.println("Search the Artist");
                break;
            case 3:
                System.out.println("Search the Producer");
                break;
            case 4:
                System.out.println("Search the Subject");
                break;
            default:
                System.out.println("Your choice is invalid");
                break;
        }
    }
}

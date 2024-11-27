import java.util.Scanner;

public class Bai14_While {
    public static void main(String[] args) {
/*        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        x = sc.nextInt();
        while(x <= 20){
            System.out.println("Your number is " + x + " smaller than 20");
            x++;
        }
        System.out.println("Your number is " +x+ " larger than 20");*/


        //Example while loop
        System.out.println("Example");
        System.out.println("Enter a number in range 1 - 99: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while(n<1 || n>99){
            System.out.println("your number is "+n+ " OUT of 1 - 99. Please enter a valid number:");
            n = sc.nextInt();
        }
        System.out.println("your number is "+n+ " IN of 1 - 99");
    }
}

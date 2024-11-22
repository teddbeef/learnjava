import java.util.Scanner;

public class Bai11_HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your year wanna check: ");
        int year = sc.nextInt();
        //check condition
        if((year % 4 == 0) && (year % 100 !=0) || (year % 400 ==0)){
            System.out.println(year + " is the leap year");
        }else {
            System.out.println(year + " isn't the leap year");
        }


        //Homework 2
        System.out.println("HOMEWORK NUMBER 2");
        System.out.println("Please enter your month wanna check: ");
        int month = sc.nextInt();
        //check condition
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            System.out.println("The month has 31 days");
        }else if(month == 4 || month == 6 || month == 9 || month == 11){
            System.out.println("The month has 30 days");
        }else if(month == 2){
            if((year % 4 == 0) && (year % 100 !=0) || (year % 400 ==0)){
                System.out.println("The month has 29 days");
            }else {
                System.out.println("The month has 28 days");
            }
        }
    }
}

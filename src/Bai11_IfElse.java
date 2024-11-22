import java.util.Scanner;

public class Bai11_IfElse {
    public static void main(String[] args) {
        double dtb;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade: ");
        dtb = sc.nextDouble();

        //Check condition
        if(dtb <= 10 && dtb>=8){
            System.out.println("Exellent");
        }else if(dtb<8 && dtb>=6.5){
            System.out.println("Perfect");
        }else if(dtb<6.5 && dtb>=5){
            System.out.println("Ok");
        }else{
            System.out.println("Failed");
        }
    }
}

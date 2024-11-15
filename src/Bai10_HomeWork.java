import java.util.Scanner;

public class Bai10_HomeWork {
    public static void main(String[] args) {
        //Tính chu vi, diện tích hình tròn
        double r, dt, cv;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn: ");
        r = sc.nextDouble();
        //diện tích
        dt = Math.PI*Math.pow(r,2);
        //chu vi
        cv = 2*Math.PI*r;
        //Show the result
        System.out.println("Diện tích hình tròn: "+dt);
        System.out.println("Chu vi hình tròn: "+cv);

        //Tính chu vi, diện tích hình chữ nhật
        int a,b;
        int cv2, dt2;
        System.out.println("Nhập chiều ngang hình chữ nhật: ");
        a = sc.nextInt();
        System.out.println("Nhập chiều cao hình chữ nhật: ");
        b = sc.nextInt();
        //chu vi hình chữ nhật
        cv2 = (a+b)*2;
        //diện tích hình chữ nhật
        dt2 = a*b;
        System.out.println("Diện tích hình chữ nhật: "+dt2);
        System.out.println("Chu vi hình chữ nhật: "+cv2);
    }
}

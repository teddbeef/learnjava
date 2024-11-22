import java.util.Scanner;

public class Bai12_HomeWork {
    public static void main(String[] args) {
        /*
            Giỏi score >= 8
            Khá 6.5 <= score < 8
            Trung Bình 5 <= score <6
            Yếu score < 5
         */
        String result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score: ");
        double score = sc.nextDouble();
        //xử lý tính toán
        result = (score >=8) ? "Giỏi" :
                (score < 8 && score >= 6.5) ? "Khá" :
                        (score < 6 && score >= 5) ? "Trung Bình" : "Yếu";
        System.out.println("According to the score so You got " +result);
    }
}

public class Bai9_ToanTuLogic {
    public static void main(String[] args) {
        int i = 11;
        // Toán tủ && - AND
        //Check i > 2 AND i < 11
        System.out.println(i>2 && i<100);

        // Toán tử || - OR
        //Check i > 2 OR i < 11
        System.out.println(i>2 || i>100);

        // Toán tử ! - NEGATIVE
        //Check i > 2 OR i < 11
        System.out.println(!(i>2 || i>100));

        //toán tử tiền tố hậu tố
        int x =90;
        int y = 102;
        int z = 39;
        int t = 1000;

        x++; //postfix
        ++y; //prefix
        z--; //postfix
        --t; //prefix
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(t);

        //NOTE: S1: Tính prefix
        //      S2: các phép toán còn lại
        //      S3: gán giá trị cho biến ở bên trái dấu bằng (=)
        //      S4: tính profix
        int a = 1;
        int b = 2;
        int c = a++ - ++b +1;
        System.out.println("Gía trị a(profix): "+a); //a=2
        System.out.println("Gía trị b(prefix): "+b); //b=3
        System.out.println("Gía trị c: "+c); //c=-1
    }
}

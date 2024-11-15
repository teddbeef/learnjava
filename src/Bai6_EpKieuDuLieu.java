public class Bai6_EpKieuDuLieu {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        double kq = (double) a/b; //ép kiểu int >> double
        System.out.println(kq);

        //Ép kiểu hẹp (double -> float -> long -> int)
        int c = 128;
        byte y = (byte) c; //ép kiểu int >> byte
        System.out.println(c);
        System.out.println(y);

        int d = 20;
        byte e = (byte) d; //ép kiểu int >> byte
        System.out.println(d);
        System.out.println(e);
    }
}

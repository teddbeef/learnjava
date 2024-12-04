public class Bai16_ForLoop {
    public static void main(String[] args) {
/*        for(int i=12; i>0; i-=2){
            System.out.println("i = " + i);
        }*/

        //Tinh tong cac so tu 0-10
        int tong = 0;
        for(int i=0; i<=10;i++){
            tong+=i;
        }
        System.out.println("tong = " +tong);
    }
}

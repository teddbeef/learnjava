public class Bai15_DoWhileLoop {
    public static void main(String[] args) {
        //Sum number 1-5
        int sum = 0;
        int a = 1;
        do{
            sum+=1;
            a++;
        }while(a<=5);
        System.out.println(sum);
    }
}

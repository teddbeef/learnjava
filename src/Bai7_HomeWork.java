public class Bai7_HomeWork {
    public static void main(String[] args) {
        int i1 = 2;
        int i2 = 5;
        int i3 = -3;
        double d1 = 2.0;
        double d2 = 5.0;
        double d3 = -0.5;
        //Bài toán (a) i1 + (i2*i3)
        double result1= (double)i1 + (i2*i3);
        System.out.println("Result of i1 + (i2*i3): "+result1);

        //Bài toán (b) i1*(i2+i3)
        double result2= (double)i1*(i2+i3);
        System.out.println("Result of i1*(i2+i3): "+result2);

        //Bài toán (c) i1/(i2+i3)
        double result3= (double)i1/(i2+i3);
        System.out.println("Result of i1/(i2+i3): "+result3);

        //Bài toán (e) i1/i2+i3
        double result4= (double)i1/i2+i3;
        System.out.println("Result of i1/i2+i3: "+result4);

        //Bài toán (g) 3+4+5/3
        double result5= (double)3+4+5/3;
        System.out.println("Result of 3+4+5/3: "+result5);

        //Bài toán (i) (3+4+5)/3
        double result6= (double)(3+4+5)/3;
        System.out.println("Result of (3+4+5)/3: "+result6);

        //Bài toán (k) d1+(d2*d3)
        float result7= (float) (d1+(d2*d3));
        System.out.println("Result of d1+(d2*d3): "+result7);

        //Bài toán (l)) d1+d2*d3
        float result8= (float) (d1+d2*d3);
        System.out.println("Result of d1+d2*d3 : "+result8);
    }
}
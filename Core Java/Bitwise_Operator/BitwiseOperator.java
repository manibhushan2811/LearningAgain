

import java.lang.*;
public class BitwiseOperator {

    public static void main(String[] args) {
        int a=0b1010;
        int b=0b1011;
        int c= a&b;
        int d= a|b;
        int e = a^b;
        int f= a>>1;
        int g= -a>>>1;
        int h= a<<1;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
       

    }
}

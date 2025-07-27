
import java.lang.*;

public class MergingAndMasking {
    public static void main(String[] args) {

        // Store two number in 1 variable
        byte a=9,b=12,c;
        c=(byte)(a<<4);
        c=(byte)(c|b);
        System.out.println((c&0b11110000)>>4);
        System.out.println("  ");
        System.out.println((c&0b00001111));

    }
}

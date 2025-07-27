import java.lang.*;

public class UpDownCasting {
    public static void main(String[] args) {
        byte b=10;
        short s=3210;
        int i=10;
        float f= 10.12f;
        double d = 10;
        char c=10;
        boolean bl = true;

        b=(byte)s;
        
        i=s;
        f=s;
        d=s;
        i=(int)f;
        System.out.println(
            "vale of i : "+c
        );


    }
}

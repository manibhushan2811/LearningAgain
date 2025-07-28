import java.lang.*;
public class StringPractice {
    public static void main(String[] args) {
        String str1="Java Program";
        String str2 = new String("Java");
        char ch[]={'A','B','C','D'};
        String str3 = new String(ch);
        byte b[]={65,66,67,68};
        String str4= new String(b);
        byte i[]={97,98,99,100};
        String str5= new String(i);
        int ab= 123224;
        String str6 = str5.valueOf(ab);


        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
          System.out.println(str5);
        System.out.println(str6);
          System.out.println(str5);

    }
    
}

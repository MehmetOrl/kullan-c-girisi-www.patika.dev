import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class KarsilastirmaOperatorleri {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int s1,s2;
        double topla,cikar,carp,bol;
        char kar;
        System.out.println("sayi1 giriniz.:");
        s1=in.nextInt();
        System.out.println("Yapmak istediğiniz işlemi seçin(+,-,/,*)");
        kar=in.next().charAt(0);
        System.out.println("sayi2 giriniz.:");
        s2=in.nextInt();


        topla=s1+s2;
        cikar=s1-s2;
        carp=s1*s2;
        bol=s1/s2;
        switch (kar)
        {
            case '+':
                System.out.println(s1+"+"+s2+"="+topla);
                break;
            case '-':
                System.out.println(s1+"-"+s2+"="+cikar);
                break;
            case '*':
                System.out.println(s1+"*"+s2+"="+carp);
                break;
            case '/':
                System.out.println(s1+"/"+s2+"="+bol);
                break;
            default:
                System.out.println("yanlış işlem sembolü girdiniz");


        }










    }
}

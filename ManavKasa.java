import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        double elma,armut,domates,patlican,muz,tutar;
        System.out.println("Elma Adedini Giriniz.:");
        elma= Input.nextDouble();
        System.out.println("Armut Adedini Giriniz.:");
        armut= Input.nextDouble();
        System.out.println("Domates Adedini Giriniz.:");
        domates= Input.nextDouble();
        System.out.println("Patlican Adedini Giriniz.:");
        patlican= Input.nextDouble();
        System.out.println("Muz Adedini Giriniz.:");
        muz= Input.nextDouble();
        tutar=(elma*3.67+armut*2.14+domates*1.11+muz*0.95+patlican*5);
        System.out.println("tutar.:"+tutar+" TL");

    }
}

import java.util.Objects;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String username, password,karar, yeniSifre, yeni;;
        System.out.print("Kullanıcı Adını Giriniz.:");
        username = inp.nextLine();
        System.out.print("Şifrenizi Giriniz.:");
        password = inp.nextLine();

        if(username.equals("patika")&&password.equals("1234"))
        {
            System.out.println("giriş yapıldı.");
        } else if (username!="patika"&&password!="1234") {
            System.out.println("bilgilerin yanlış");

        }

        if (username.equals("patika") && !Objects.equals(password, "1234")) {
            System.out.println("şifreniz yanlış şifrenizi sıfırlamak ister misiniz?(evet/hayır)");
            karar = inp.nextLine();

            if (karar.equals("evet")) {
                System.out.println("yeni şifrenizi giriniz.:");
                yeniSifre = inp.nextLine();
                if (yeniSifre.equals("1234") || yeniSifre.equals(password)) {
                    System.out.println("yeni şifreniz eski şifre ve hatalı girdiğiniz şifre olamaz başka şifre giriniz.:");
                    yeniSifre = inp.nextLine();
                    System.out.println("şifreniz oluşturuldu.");
                    password = yeniSifre;
                    System.out.println("şifrenizi tekrardan girip giriş yapabilirsiniz.");
                    yeni = inp.nextLine();
                    System.out.println("giriş yapıldı.");
                } else {
                    System.out.println("şifreniz olşturuldu  tekrardan şifrenizi girip giriş  yapabilirsiniz.:");
                    yeni = inp.nextLine();
                    System.out.println("giriş yapıldı");

                }



            }


        }
    }
}







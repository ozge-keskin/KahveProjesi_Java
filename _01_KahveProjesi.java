package PROJELER;

import java.util.Scanner;

public class _01_KahveProjesi
{
    public static void main(String[] args) {
        Scanner readerStr=new Scanner(System.in);

        System.out.println("Hangi kahveyi içmek istersiniz? => ");
        System.out.println("1.Türk Kahvesi");
        System.out.println("2.Filtre Kahve");
        System.out.println("3.Espresso");
        System.out.print("Tercihiniz=");

        String tercih =readerStr.nextLine().toLowerCase();

        switch(tercih) {
            case "türk kahvesi" :System.out.println("Türk Kahvesi hazırlanıyor."); break;
            case "filtre kahve" :System.out.println("Filtre Kahve hazırlanıyor"); break;
            case "espresso" :System.out.println("Espresso hazırlanıyor"); break;
            default: System.out.println("Hatalı giriş yaptınız.Tekrar deneyiniz.");
        }
        System.out.println();
        System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız)");
        String sutIsterMi=readerStr.nextLine().toLowerCase();
        if (sutIsterMi.equals("evet")){
            System.out.println("Süt ekleniyor...");
        }
        else
        {
            System.out.println("Süt eklenmiyor...");
        }

        System.out.println();
        System.out.println("Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) : ");
        String sekerIsterMi=readerStr.nextLine().toLowerCase();
        if (sekerIsterMi.equals("evet")){
            System.out.println("Kaç şeker istersiniz =");
            int sekerAdedi=readerStr.nextInt();
            System.out.println( sekerAdedi + " adet şeker ekleniyor");
        }
        else
        {
            System.out.println("Şeker eklenmiyor.");
        }
        Scanner oku=new Scanner(System.in);
        System.out.print("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :");
        String boyut= oku.nextLine().toLowerCase();
        System.out.printf("Kahveniz "+ boyut +" boy hazırlanıyor.)");
        System.out.println("Kahveniz hazır tekrar bekleriz :)");
    }
}
/*
1 - Ekrandan bir tane pozitif tamsayı alacaksınız, bu sayı 𝒏 ile gösterelim. (5 puan)
2 - Uzunluğu 𝒏 olan bir tane tamsayı dizisi tanımlayacaksınız ve bu dizinin içini [−𝟐𝟓, 𝟐𝟓] aralığından (-25
ve 25 dahil) rastgele tamsayılar seçerek dolduracaksınız. (25 puan)
3 - Diziye sayıları atadıktan sonra ekrana dizi elemanlarını sayılar arasında birer boşluk bırakarak yan yana
bastıracaksınız. (10 puan)
Bu işlemleri yaptıktan sonra ekrana dizinin en büyük negatif sayısını ekrana basacaksınız. Eğer dizide
negatif sayı yoksa bu durumda seçilen sayıyı 0 gibi kabul edeceksiniz. (60 puan)
 */ 
import java.util.Scanner;
import java.util.Random;

public class S24089 {

    public static void main(String[] args) {
        int n;
        Scanner values = new Scanner(System.in);
        System.out.print("n sayisini giriniz: ");
        n = values.nextInt();
        int[] dizi1 = new int[n];
        boolean dizidevar = false;
        int sira = 0;
        int sonuc = 0;
        System.out.print("dizi 1:");
        do {
            Random random = new Random();
            int sayi = random.nextInt(26 + 25) - 25;
            for (int i = 0; i < dizi1.length; i++) {
                if (dizi1[i] == sayi) {
                    dizidevar = true;
                    break;
                }
            }
            if (!dizidevar) {
                dizi1[sira] = sayi;
                sira++;
            }
            dizidevar = false;
        } while (sira < n);
        for (int i = 0; i < dizi1.length; i++) {
            System.out.print(" " + dizi1[i]);
        }
        for (int i = 0; i < dizi1.length; i++) {
            if (sonuc == 0 && dizi1[i] < sonuc) {

                sonuc = dizi1[i];
            } else if (sonuc < dizi1[i] && dizi1[i] < 0) {

                sonuc = dizi1[i];

            }
        }
        System.out.println("\nsonuc: " + sonuc);

    }

}

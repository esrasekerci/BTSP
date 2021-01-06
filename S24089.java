
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

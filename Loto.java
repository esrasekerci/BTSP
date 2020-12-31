import java.util.Arrays;

public class Loto {

    public static void main(String[] args) {

        int[] sayilar = new int[6];
        boolean dizidevar = false;
        int sira = 0;

        do {
            int sayi = (int) (Math.random() * 48) + 1;
            for (int i = 0; i < sayilar.length; i++) {
                if (sayilar[i] == sayi) {
                    dizidevar = true;
                    break;
                }
            }
            if (!dizidevar) {
                sayilar[sira] = sayi;
                sira++;
            }
            dizidevar = false;
        } while (sira < 6);

        Arrays.sort(sayilar);
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);
        }

    }
}

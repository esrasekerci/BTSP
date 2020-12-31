import javax.swing.JOptionPane;

public class NumPredict {

    public static void main(String[] args) {
        int randomsayi = 1 + (int) (Math.random() * 20);
        int sayi1;
        int sayac = 0;

        do {
            sayac++;
            sayi1 = Integer.parseInt(JOptionPane.showInputDialog("1-20 arasında tahmin sayınızı giriniz!"));
            if (sayi1 > randomsayi) {
                JOptionPane.showMessageDialog(null, "Fazla tahmin ettiniz, tekrar deneyiniz.");
            }
            if (sayi1 < randomsayi) {
                JOptionPane.showMessageDialog(null, "Az tahmin ettiniz, tekrar deneyiniz.");
            }
            if (sayi1 == randomsayi) {
                JOptionPane.showMessageDialog(null, "Tebrikler, " + sayac + ". denemede buldunuz.");
            }
        } while (sayi1 != randomsayi);

    }
}

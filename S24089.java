//p-büyülü sayılarını ekrana bastırmanızı istiyoruz. Bir sayının p-büyülü olabilmesi için aşağıdaki koşulları sağlaması gerekmektedir:
//• p'den büyük olacak
//• 2 ile p (dahil) arasında en az bir tam böleni olacak
//• 1 fazlası 3’e tam bölünmeyecek
//Programınız önce kullanıcıdan p sayısını alarak başlayacak. Daha sonra kullanıcıdan ikinci bir pozitif x tam sayısını alacaksınız.
//Bu iki sayı alındıktan sonra ekrana x sayısından küçük eşit bütün p-büyülü sayılarını bastıracaksınız.

import java.util.Scanner;

public class S24089 {

    public static void main(String[] args) {
        int p, x, buyulu;
        Scanner values = new Scanner(System.in);
        System.out.print("p sayisini giriniz: ");
        p = values.nextInt();
        System.out.print("x sayisini giriniz: ");
        x = values.nextInt();
        System.out.print("p-buyulu sayilar:");
        for (buyulu = p + 1; buyulu <= x; buyulu++) {
            for (int k = 2; k <= p; k++) {
                if (((buyulu + 1) % 3 != 0) && (buyulu % k == 0)) {
                    System.out.print(" " + buyulu);
                    break;
                }
            }

        }
    }
}

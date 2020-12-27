
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

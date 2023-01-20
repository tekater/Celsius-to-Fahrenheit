import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double C = scanner.nextDouble();
        double F = C*1.8 + 32;
        
        System.out.println(F); // 32.9 > 91.22    |    0 > 32.0    |    -50 > -58
        //System.out.println(C*1.8 + 32);
    }
}

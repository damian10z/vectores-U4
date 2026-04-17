//CDD
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] v = new String[6];
        for (int i = 0; i < 6; i++) v[i] = sc.next();
        for (int i = 5; i >= 0; i--) System.out.println(v[i]);
    }
}
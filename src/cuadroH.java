//CD
    import java.util.Scanner;
public class cuadroH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = new String[5];
        double[] c = new double[5];
        int max = 0, min = 0;
        for (int i = 0; i < 5; i++) {
            n[i] = sc.next();
            c[i] = sc.nextDouble();
            if (c[i] > c[max]) max = i;
            if (c[i] < c[min]) min = i;
        }
        System.out.println("Mejor: " + n[max] + " Peor: " + n[min]);
    }
}


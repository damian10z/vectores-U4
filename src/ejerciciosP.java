//CoinD2
import java.util.Scanner;

public class ejerciciosP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[5];
        double[] notas = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Nombre: ");
            nombres[i] = sc.nextLine();
            System.out.print("Nota: ");
            notas[i] = sc.nextDouble();
            sc.nextLine(); 
        }

        double max = notas[0];
        double min = notas[0];
        int iMax = 0;
        int iMin = 0;

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > max) {
                max = notas[i];
                iMax = i;
            }
            if (notas[i] < min) {
                min = notas[i];
                iMin = i;
            }
        }

        System.out.println("\nMEJOR PROMEDIO: " + nombres[iMax] + " (" + max + ")");
        System.out.println("NECESITA TUTORÍA: " + nombres[iMin] + " (" + min + ")");

        sc.close();
    }
}

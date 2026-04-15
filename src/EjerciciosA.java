import java.util.Scanner;

public class EjerciciosA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] lluviaDias = new double[7];
        double sumaTotal = 0;
        double promedio = 0;
        int diasSobrePromedio = 0;
        System.out.println("--- Registro de Lluvia Semanal ---");
        for (int i = 0; i < lluviaDias.length; i++) {
            System.out.print("Ingrese la cantidad de lluvia(MM) para el día " + (i + 1) + ": ");
            lluviaDias[i] = sc.nextDouble();
            sumaTotal += lluviaDias[i];
        }

        promedio = sumaTotal / lluviaDias.length;
        for (int i = 0; i < lluviaDias.length; i++) {
            if (lluviaDias[i] > promedio) {
                diasSobrePromedio++;
            }
        }
        System.out.println("\n--- Reporte Meteorológico ---");
        System.out.println("Total de lluvia: " + sumaTotal + " mm");
        System.out.println("Promedio diario: " + promedio + " mm");
        System.out.println("Días que superaron el promedio: " + diasSobrePromedio);

        sc.close();
    }
}

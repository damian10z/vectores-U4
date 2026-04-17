//Coind4
public class ejercicoD {
    public static void main(String[] args) {
        double[] m_a = {12.5, 13.0, 12.8, 13.2};
        double[] m_b = {14.1, 14.0, 13.9};
        double[] total = new double[m_a.length + m_b.length];
        for (int i = 0; i < m_a.length; i++) {
            total[i] = m_a[i];
        }
        for (int i = 0; i < m_b.length; i++) {
            total[m_a.length + i] = m_b[i];
        }
        System.out.println("Inventario Consolidado:");
        for (double peso : total) {
            System.out.print(peso + " | ");
        }
    }
}
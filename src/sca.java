//CoinD1
import java.util.Scanner;
public class sca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] autorizados = {1024, 2048, 4096, 8192, 16384};
        
        System.out.print("Ingrese ID de credencial: ");
        int idIngresado = sc.nextInt();
        int acceso = 0; 
        for (int i = 0; i < autorizados.length; i++) {
            if (idIngresado == autorizados[i]) {
                acceso = 1;
                break; 
            }
        }
        
        if (acceso == 1) {
            System.out.println("[ACCESO CONCEDIDO] Bienvenido al Site.");
        } else {
            System.out.println("[ALERTA] Acceso denegado. Personal no autorizado.");
        }
        
        sc.close();
    }
}

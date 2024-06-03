package View;
import Controller.GenerarData;
import Controller.PPL;
public class Ejecutor {
    public static void main(String[] args) {
        int n = 1000;
        GenerarData generador = new GenerarData();
        String nombres[] = generador.generarNombresPPL();
        int edades[] = generador.generaredades();
        String cedulas[] = generador.generarCedulas();
        String delitos[] = generador.generardelitos();
        String fechasIngreso[] = generador.generarFechasIngreso();
        PPL[] ppl = new PPL[n];
        for (int i = 0; i < n; i++) {
            ppl[i] = new PPL(nombres[i], edades[i], cedulas[i], fechasIngreso[i], delitos[i]);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(ppl);
        }
        
    }
}
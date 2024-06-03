package View;
import Controller.GenerarData;
public class Ejecutor {
    public static void main(String[] args) {
        int n = 1000;
        GenerarData generador = new GenerarData();
        String nombres[] = generador.generarNombresPPL();
        String edades[] = generador.generaredades();
        String cedulas[] = generador.generarCedulas();
        String delitos[] = generador.generardelitos();
    }
}
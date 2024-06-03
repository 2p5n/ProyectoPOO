package View;

import Controller.Carcel;
import Controller.GenerarData;
import Controller.PPL;
import java.util.Scanner;
public class Ejecutor {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int n = 200;//Tamaño principal
        GenerarData generador = new GenerarData();//Instanciar el objeto para generar la informacion

        //Meter en arreglos la data
        String nombres[] = generador.generarNombresPPL();
        int edades[] = generador.generaredades();
        String cedulas[] = generador.generarCedulas();
        String delitos[] = generador.generardelitos();
        String fechasIngreso[] = generador.generarFechasIngreso();

        //Instanciar la lista de PPL
        PPL[] listaPPL = new PPL[1000];
        for (int i = 0; i < 1000; i++) {
            listaPPL[i] = new PPL(nombres[i], edades[i], cedulas[i], fechasIngreso[i], delitos[i]);
        }
        
        //Instanciar la carcel
        Carcel carcel = new Carcel(listaPPL);
        carcel.asignarClasificacion();
        carcel.asignarPena();
        carcel.asignarPabellon();
        carcel.calcularFechaSalida();
        carcel.calcularAniosRestantes();
        System.out.println(carcel);
        System.out.println("INGRESA LA CEDULA DEL PPL QUE QUIERES ELIMINAR");
        String cedula = tc.next();
        carcel.eliminarPreso(cedula);
        System.out.println(carcel);
        carcel.consultarCuposDisponibles();
        /*
        if(carcel.eliminarPreso(cedula)){
            System.out.println(carcel);
            System.out.println("PRESO: "+cedula+" ELIMINADO");
        }else
            System.out.println("HIJUEPUTA NO ENCONTRADO");
            */
        // Mostrar datos de la cárcel
        
    }
}
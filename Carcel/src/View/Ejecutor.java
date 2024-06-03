package View;

import Controller.Carcel;
import Controller.GenerarData;
import Controller.PPL;
import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int n = 200;//Tamaño principal
        double prom = 0;
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
        prom = carcel.promedioEdades();
        System.out.println(carcel);
        carcel.promDelitoPabe();
        carcel.promEdadesPabe();
        System.out.println("Promedio de Edades de la carcel: " + prom);
/*
        System.out.println("INGRESA LA CEDULA DEL PPL QUE QUIERES ELIMINAR");
        String cedula = tc.next();
        carcel.eliminarPreso(cedula);
        System.out.println(carcel);
        carcel.consultarCuposDisponibles();
        System.out.println("Ingresa los datos del PPL que deseas meter");
        System.out.println("En que pabellon deseas meterlo?");
        String pabellon = tc.next();
        System.out.println("Nombre:");
        String nombre = tc.next();
        System.out.println("Edad");
        int edad = tc.nextInt();
        System.out.println("Cedula:");
        String cedulita = tc.next();
        System.out.println("Delito");
        String delito = tc.next();
        carcel.agregarPPL(pabellon, nombre, cedula, edad, delito);
        System.out.println(carcel);
*/
        System.out.println("INGRESA LA CEDULA DEL PPL QUE QUIERES DAR UN AGRAVANTE");
        String cedula2 = tc.next();
        System.out.println("INGRESA EL TIEMPO DEL AGRAVANTE (anios)");
        int agravante = tc.nextInt();
        carcel.asignarAgravantes(cedula2, agravante);
        carcel.calcularFechaSalida();
        System.out.println(carcel);
    }
}

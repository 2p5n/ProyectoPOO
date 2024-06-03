package Controller;

import java.time.LocalDate;
import java.util.Random;

public class GenerarData {

    // Constructor que acepta los arreglos como parámetros
    public GenerarData() {
    }

    public String[] generarCedulas() { //Generar identificaciondes de los PPL
        String array[] = new String[1000];
        int x1 = 0;
        int x2 = 0;
        for (int i = 0; i < array.length; i++) {
            x1 = (int) (Math.random() * 90102 - 1) + 10190;
            x2 = (int) (Math.random() * 90102 - 1) + 10190;
            array[i] = String.valueOf(x1) + String.valueOf(x2);
        }
        return array;
    }

    public String[] generarNombresPPL() { //Generar nombres completos de los PPL
        String array[] = new String[1000];
        String nomPersonas1[] = {"Roberto", "Dario", "Fabian", "Gonzalo", "Carlos", "Mario", "Pedro", "Victor", "Michael", "Byron"};
        String nomPersonas2[] = {"Antonio", "Cesar", "Pablo", "Adrian", "Diego", "Julian", "Sergio", "Paulo", "Angel", "Vicente"};
        String apePersonas1[] = {"Paredes", "Romero", "Cuenca", "Guerrero", "Garcia", "Torres", "Cevallos", "Perero", "Gonzales", "Perez"};
        String apePersonas2[] = {"Sanchez", "Ramirez", "Hidalgo", "Rivera", "Gomez", "Espinosa", "Reyes", "Roman", "Morales", "Castro"};
        for (int i = 0; i < array.length; i++) {
            int indAleatorioNomb1 = (int) (Math.random() * nomPersonas1.length - 1) + 0;
            int indAleatorioNomb2 = (int) (Math.random() * nomPersonas2.length - 1) + 0;
            int indAleatorioApe1 = (int) (Math.random() * apePersonas1.length - 1) + 0;
            int indAleatorioApe2 = (int) (Math.random() * apePersonas1.length - 1) + 0;
            array[i] = nomPersonas1[indAleatorioNomb1] + " " + nomPersonas2[indAleatorioNomb2] + " " + apePersonas1[indAleatorioApe1] + " " + apePersonas2[indAleatorioApe2];
        }
        return array;
    }

    public String[] generaredades() { //Generar edades de los PPL
        String array[] = new String[1000];
        int edad = 0;
        int anioActual = 0;
        LocalDate fechaActual = LocalDate.now();
        anioActual = fechaActual.getYear();
        String anioIngresoAux = null;
        int anioIngreso = 0;
        int resto = 0;
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            edad = rand.nextInt(50 - 18 + 1) + 18;
            anioIngresoAux = array[i].substring(6);
            anioIngreso = Integer.valueOf(anioIngresoAux);
            resto = anioActual - anioIngreso;
            if (edad <= (resto + 18)) {
                edad = (resto + 18) + (int) (Math.random() * 5 - 1) + 1;
            }
            array[i] = String.valueOf(edad);
        }
        return array;
    }

    public String[] generardelitos() {//Generar el delito cometido
        String array[] = new String[1000];
        int indAleatorio = 0;
        Random rand = new Random();
        String delitosA[] = {"Narcotrafico", "Homicidio"};
        String delitosM[] = {"Robo", "Hurto", "Fraude", "Evasion"};
        String delitosB[] = {"Invasion", "Amenazas", "Estafa", "Otros"};
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("Alto")) {
                indAleatorio = rand.nextInt((delitosA.length - 1) - 0 + 1) + 0;
                array[i] = delitosA[indAleatorio];
            } else if (array[i].equals("Medio")) {
                indAleatorio = rand.nextInt((delitosM.length - 1) - 0 + 1) + 0;
                array[i] = delitosM[indAleatorio];
            } else if (array[i].equals("Bajo")) {
                indAleatorio = rand.nextInt((delitosB.length - 1) - 0 + 1) + 0;
                array[i] = delitosB[indAleatorio];
            }
        }
        return array;
    }
}

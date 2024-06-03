package Controller;

import java.time.LocalDate;
import java.util.Random;

public class GenerarData {
    public GenerarData() {
    }
    
    public String fechaActual(){ //RETORNA UNA CADENA CON LA FECHA ACTUAL
        LocalDate fechaActual = LocalDate.now();
        String fechaCadena = null;
        int diaActual = fechaActual.getDayOfMonth();
        int mesActual = fechaActual.getMonthValue();
        int anioActual = fechaActual.getYear();
        fechaCadena = String.valueOf(diaActual)+"/"+String.valueOf(mesActual)+"/"+String.valueOf(anioActual);
        return fechaCadena;
    }
    
    public String[] generarCedulas() { //RETORNA UN ARRAY DE CADENAS CON CEDULAS DE 10 DIGITOS
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

    public String[] generarNombresPPL() { //RETORNA UN ARRAY DE CADENAS CON  NOMBRES ALEATORIOS
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

    public int[] generaredades() { //RETORNA UN ARRAY DE ENTEROS CON EDADES ALEATORIAS
        int[] array = new int[1000];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            // Generar una edad aleatoria entre 18 y 50 años
            int edad = rand.nextInt(50 - 18 + 1) + 18;
            array[i] = edad;
        }
        return array;
    }

    public String[] generardelitos() { //RETORNA UN ARRAY DE CADENAS CON DELITOS ALEATORIOS
        //GENERAR DELITOS ALTA PELIGROSIDAD
        String[] arrayA = new String[200];
        String[] arrayM1 = new String[200];
        String[] arrayM2 = new String[200];
        String[] arrayB1 = new String[200];
        String[] arrayB2 = new String[200];
        String[] listaDelitos = new String[1000];
        Random rand = new Random();
        String[] delitosA = {"Narcotrafico", "Homicidio"};
        for (int i = 0; i < arrayA.length; i++) {
            // Generar un índice aleatorio para seleccionar un delito
            int indAleatorio = rand.nextInt(delitosA.length);
            arrayA[i] = delitosA[indAleatorio];
        }
        
        //GENERAR DELITOS MEDIA PELIGROSIDAD PABELLON 2
        String[] delitosM = {"Robo", "Hurto", "Fraude", "Evasion"};
        for (int i = 0; i < arrayM1.length; i++) {
            // Generar un índice aleatorio para seleccionar un delito
            int indAleatorio = rand.nextInt(delitosM.length);
            arrayM1[i] = delitosM[indAleatorio];
        }
        
        //GENERAR DELITOS MEDIA PELIGROSIDAD PABELLON 3
        for (int i = 0; i < arrayM2.length; i++) {
            // Generar un índice aleatorio para seleccionar un delito
            int indAleatorio = rand.nextInt(delitosM.length);
            arrayM2[i] = delitosM[indAleatorio];
        }
        
        //GENERAR DELITOS BAJA PELIGROSIDAD PABELLON 4
        String[] delitosB = {"Invasion", "Amenazas", "Estafa", "Otros"};
        for (int i = 0; i < arrayB1.length; i++) {
            // Generar un índice aleatorio para seleccionar un delito
            int indAleatorio = rand.nextInt(delitosB.length);
            arrayB1[i] = delitosB[indAleatorio];
        }
        
        //GENERAR DELITOS BAJA PELIGROSIDAD PABELLON 5
        for (int i = 0; i < arrayB2.length; i++) {
            // Generar un índice aleatorio para seleccionar un delito
            int indAleatorio = rand.nextInt(delitosB.length);
            arrayB2[i] = delitosB[indAleatorio];
        }
        
        //UNIR TODOS LOS ARREGLOS ANTERIORES EN UNO SOLO
        System.arraycopy(arrayA, 0, listaDelitos, 0, 200);
        System.arraycopy(arrayM1, 0, listaDelitos, 200, 200);
        System.arraycopy(arrayM2, 0, listaDelitos, 400, 200);
        System.arraycopy(arrayB1, 0, listaDelitos, 600, 200);
        System.arraycopy(arrayB2, 0, listaDelitos, 800, 200);
        
        //RETORNAR LA LISTA COMPLETA
        return listaDelitos;
    }
  
    public String[] generarFechasIngreso() { //RETORNA UN ARRAY DE CADENAS CON FECHAS DE INGRESO ALEATORIAS
        String array[] = new String[1000];
        int dia = 0;
        int mes = 0;
        int anio = 0;
        LocalDate fechaActual = LocalDate.now();
        Random rand = new Random();
        int anioActual = fechaActual.getYear();
        for (int i = 0; i < array.length; i++) {
            dia = (int) (Math.random() * 31) + 1;
            mes = (int) (Math.random() * 12) + 1;
            anio = rand.nextInt(Integer.valueOf(anioActual) - 2020 + 1) + 2020;
            if ((dia < 10) && (mes < 10)) {
                array[i] = "0" + String.valueOf(dia) + "/0" + String.valueOf(mes) + "/" + String.valueOf(anio);
            } else if (dia < 10) {
                array[i] = "0" + String.valueOf(dia) + "/" + String.valueOf(mes) + "/" + String.valueOf(anio);
            } else if (mes < 10) {
                array[i] = String.valueOf(dia) + "/0" + String.valueOf(mes) + "/" + String.valueOf(anio);
            } else {
                array[i] = String.valueOf(dia) + "/" + String.valueOf(mes) + "/" + String.valueOf(anio);
            }
        }
        return array;
    }
}

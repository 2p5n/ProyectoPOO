package Controller;
import java.time.LocalDate;
import java.util.Random;
public class GenerarData {
    private int n = 1000;
    private String[] nombre;
    private String[] edad;
    private String[] cedula;
    private String[] delito;
    // Constructor que acepta los arreglos como parámetros
    public GenerarData(String[] nombre, String[] edad, String[] cedula, String[] delito) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.delito = delito;
    }
    public void generarCedulas(String[] array) { //Generar identificaciondes de los PPL
        int x1 = 0;
        int x2 = 0;
        for (int i = 0; i < array.length; i++) {
            x1 = (int) (Math.random() * 90102 - 1) + 10190;
            x2 = (int) (Math.random() * 90102 - 1) + 10190;
            array[i] = String.valueOf(x1) + String.valueOf(x2);
        }
    }
    public void generarNombresPPL(String array[]) { //Generar nombres completos de los PPL
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
    }
    public void generaredades(String[] array) { //Generar edades de los PPL
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
    }
    public void generardelitos(String[] array) {//Generar el delito cometido
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
    }
    public void ingresarDatos(String nombre[], String edad[], String cedula[], String delito[]){
        generarNombresPPL(nombre);
        generaredades(edad);
        generarCedulas(cedula);
        generardelitos(delito);
    }
}
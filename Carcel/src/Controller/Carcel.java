package Controller;

import java.time.LocalDate;
import java.util.Random;

public class Carcel {

    // ATRIBUTOS
    private PPL[] listaPPLCompleta;

    // CONSTRUCTOR
    public Carcel(PPL[] listaPPLCompleta) {
        this.listaPPLCompleta = listaPPLCompleta;
    }
    
    //ASIGNAR CLASIFICACION SEGUN EL DELITO
    public void asignarClasificacion() {
        for (int i = 0; i < this.listaPPLCompleta.length; i++) {
            if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Narcotrafico")) {
                this.listaPPLCompleta[i].setClasificacion("Alto");
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Homicidio")) {
                this.listaPPLCompleta[i].setClasificacion("Alto");
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Robo")) {
                this.listaPPLCompleta[i].setClasificacion("Medio");
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Hurto")) {
                this.listaPPLCompleta[i].setClasificacion("Medio");
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Fraude")) {
                this.listaPPLCompleta[i].setClasificacion("Medio");
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Evasion")) {
                this.listaPPLCompleta[i].setClasificacion("Medio");
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Invasion")) {
                this.listaPPLCompleta[i].setClasificacion("Bajo");
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Amenazas")) {
                this.listaPPLCompleta[i].setClasificacion("Bajo");
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Estafa")) {
                this.listaPPLCompleta[i].setClasificacion("Bajo");
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Otros")) {
                this.listaPPLCompleta[i].setClasificacion("Bajo");
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Invasion")) {
                this.listaPPLCompleta[i].setClasificacion("Bajo");
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Amenazas")) {
                this.listaPPLCompleta[i].setClasificacion("Bajo");
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Estafa")) {
                this.listaPPLCompleta[i].setClasificacion("Bajo");
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Otros")) {
                this.listaPPLCompleta[i].setClasificacion("Bajo");
            }
        }
    }
    
    //ASIGNAR PENAS SEGUN EL DELITO
    public void asignarPena(){
        for (int i = 0; i < this.listaPPLCompleta.length; i++) {
            if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Narcotrafico")) {
                this.listaPPLCompleta[i].setPena(80);
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Homicidio")) {
                this.listaPPLCompleta[i].setPena(40);
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Robo")) {
                this.listaPPLCompleta[i].setPena(20);
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Hurto")) {
                this.listaPPLCompleta[i].setPena(15);
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Fraude")) {
                this.listaPPLCompleta[i].setPena(15);
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Evasion")) {
                this.listaPPLCompleta[i].setPena(10);
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Invasion")) {
                this.listaPPLCompleta[i].setPena(10);
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Amenazas")) {
                this.listaPPLCompleta[i].setPena(7);
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Estafa")) {
                this.listaPPLCompleta[i].setPena(5);
            } else if (this.listaPPLCompleta[i].getDelito().equalsIgnoreCase("Otros")) {
                this.listaPPLCompleta[i].setPena(2);
            }
        }
    }
    
    //ASIGNAR PABELLONES SEGUN LA CLASIFICACION
    public void asignarPabellon(){
        for (int i = 0; i < this.listaPPLCompleta.length; i++){
            if (this.listaPPLCompleta[i].getClasificacion().equalsIgnoreCase("Alto"))
                this.listaPPLCompleta[i].setPabellon("A");
            else if (this.listaPPLCompleta[i].getClasificacion().equalsIgnoreCase("Medio"))
                this.listaPPLCompleta[i].setPabellon("M");
            else if (this.listaPPLCompleta[i].getClasificacion().equalsIgnoreCase("Bajo"))
                this.listaPPLCompleta[i].setPabellon("B");
        }
    }
    
    //CALCULAR FECHA DE SALIDA
    public void calcularFechaSalida() {
        String anioIngreso;
        String dia;
        String mes;
        int anioSalida = 0;
        int pena;
        for (int i = 0; i < this.listaPPLCompleta.length; i++) {
            dia = this.listaPPLCompleta[i].getFechaIngreso().substring(0, 2);
            mes = this.listaPPLCompleta[i].getFechaIngreso().substring(3, 5);
            anioIngreso = this.listaPPLCompleta[i].getFechaIngreso().substring(6);
            pena = this.listaPPLCompleta[i].getPena();
            anioSalida = Integer.parseInt(anioIngreso) + pena;
            this.listaPPLCompleta[i].setFechaSalida(dia + "/" + mes + "/" + String.valueOf(anioSalida));
        }
    }  
    
    //CALCULAR ANIOS RESTANTES 
    public void calcularAniosRestantes() {
        LocalDate fechaActual = LocalDate.now();
        int anioActual = fechaActual.getYear();

        for (int i = 0; i < this.listaPPLCompleta.length; i++) {
            String fechaSalida = this.listaPPLCompleta[i].getFechaSalida();
            int anioSalida = Integer.parseInt(fechaSalida.substring(6));
            this.listaPPLCompleta[i].setAniosRestantes(anioSalida - anioActual);
        }
    }
    
    //ELIMINAR UN PPL
    public void eliminarPreso(String cedula) {
        boolean encontrado = false;
        for (int i = 0; i < this.listaPPLCompleta.length; i++) {
            if (this.listaPPLCompleta[i].getCedula().equalsIgnoreCase(cedula)) {
                this.listaPPLCompleta[i].setNombre("-");
                this.listaPPLCompleta[i].setEdad(0);
                this.listaPPLCompleta[i].setCedula("-");
                this.listaPPLCompleta[i].setFechaIngreso("-");
                this.listaPPLCompleta[i].setDelito("-");
                this.listaPPLCompleta[i].setFechaSalida("-");
                this.listaPPLCompleta[i].setAniosRestantes(0);
                this.listaPPLCompleta[i].setClasificacion("-");
                this.listaPPLCompleta[i].setPena(0);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("PPL NO ENCONTRADO");
        }
    }
    
    //CONSULTAR DISPONIBILIDAD DE CUPOS
    public void consultarCuposDisponibles(){
        boolean haycupos = false;
        int cuposDispP_A = 0;
        int cuposDispP_M = 0;
        int cuposDispP_B = 0;
        for (int i = 0; i < this.listaPPLCompleta.length; i++) {
            if(this.listaPPLCompleta[i].getNombre().equalsIgnoreCase("-")&&this.listaPPLCompleta[i].getPabellon().equalsIgnoreCase("A")){
                haycupos = true;
                cuposDispP_A+=1;
            }
        }
        System.out.println("Hay "+cuposDispP_A+" cupos disponibles en el pabellon A (Alta peligrosidad)");
        
        for (int i = 0; i < this.listaPPLCompleta.length; i++) {
            if(this.listaPPLCompleta[i].getNombre().equalsIgnoreCase("-")&&this.listaPPLCompleta[i].getPabellon().equalsIgnoreCase("M")){
                haycupos = true;
                cuposDispP_M+=1;
            }
        }
        System.out.println("Hay "+cuposDispP_M+" cupos disponibles en el pabellon M (Media Peligrosidad)");
        
        for (int i = 0; i < this.listaPPLCompleta.length; i++) {
            if(this.listaPPLCompleta[i].getNombre().equalsIgnoreCase("-")&&this.listaPPLCompleta[i].getPabellon().equalsIgnoreCase("B")){
                haycupos = true;
                cuposDispP_B+=1;
            }
        }
        System.out.println("Hay "+cuposDispP_B+" cupos disponibles en el pabellon M (Media Peligrosidad)");
        
        if(!haycupos)
            System.out.println("NO HAY CUPOS DISPONIBLES");
    }
    
    //INGRESAR UN PPL A LA CARCEL SOLO SI HAY CUPOS DISPONIBLES
    /*
    public void agregarPPL(String nombre, String cedula, int edad, String delito){
        for (int i = 0; i < this.listaPPLCompleta.length; i++) {
            if(this.listaPPLCompleta[i].getNombre().equalsIgnoreCase("-")){
                cuposDisp+=1;
            }
        }
    }*/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carcel{");
        for (PPL ppl : listaPPLCompleta) {
            sb.append(ppl.toString()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
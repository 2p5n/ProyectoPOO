package Controller;
//CLASE BASE PARA CREAR PPLs
public class PPL {
    //ATRIBUTOS
    private String nombre;
    private int edad;
    private String cedula;
    private String fechaIngreso;
    private String fechaSalida;
    private int aniosRestantes;
    private String clasificacion;
    private String delito;
    private int pena; //Años
    private int visitasSemanales;
    
    //CONSTRUCTOR
    public PPL(String nombre, String cedula, int pena) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.pena = pena;
    }
    
    //TOSTRING
    
    //METODOS ESPECIALES
    
    //SETTERS Y GETTERS
    
}

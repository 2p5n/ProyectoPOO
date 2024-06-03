package Controller;
//CLASE BASE PARA CREAR PPLs
public class PPL {
    // ATRIBUTOS
    private String nombre;
    private int edad;
    private String cedula;
    private String fechaIngreso;
    private String fechaSalida;
    private int aniosRestantes;
    private String clasificacion;
    private String delito;
    private int pena; // Años
    private int visitasSemanales;
    private String pabellon;
    
    // CONSTRUCTOR
    public PPL(String nombre, int edad, String cedula, String fechaIngreso, String delito) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = null;
        this.aniosRestantes = 0;
        this.clasificacion = null;
        this.delito = delito;
        this.pena = 0;
        this.visitasSemanales = 0;
        this.pabellon = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getAniosRestantes() {
        return aniosRestantes;
    }

    public void setAniosRestantes(int aniosRestantes) {
        this.aniosRestantes = aniosRestantes;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getDelito() {
        return delito;
    }

    public void setDelito(String delito) {
        this.delito = delito;
    }

    public int getPena() {
        return pena;
    }

    public void setPena(int pena) {
        this.pena = pena;
    }

    public int getVisitasSemanales() {
        return visitasSemanales;
    }

    public void setVisitasSemanales(int visitasSemanales) {
        this.visitasSemanales = visitasSemanales;
    }

    public String getPabellon() {
        return pabellon;
    }

    public void setPabellon(String pabellon) {
        this.pabellon = pabellon;
    }
    
    //TOSTRING
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PPL{");
        sb.append("nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append(", cedula=").append(cedula);
        sb.append(", fechaIngreso=").append(fechaIngreso);
        sb.append(", fechaSalida=").append(fechaSalida);
        sb.append(", pena=").append(pena);
        sb.append(", clasificacion=").append(clasificacion);
        sb.append(", anios restantes=").append(aniosRestantes);
        sb.append(", delito=").append(delito);
        sb.append(", pabellon=").append(pabellon);
        sb.append('}');
        return sb.toString();
    }
     
}
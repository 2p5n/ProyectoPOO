package Controller;
public class Pabellon {
    private int numeroPabe;
    private String nombrePabe;
    private int capacidadPabe;
    private String clasificacionPabe;
    private int c;
    private int p;
    String [] Celda = new String [c];
    String [] PPL = new String [p];

    public Pabellon(int numeroPabe, String nombrePabe, int capacidadPabe, String clasificacionPabe, int c, int p) {
        this.numeroPabe = numeroPabe;
        this.nombrePabe = nombrePabe;
        this.capacidadPabe = capacidadPabe;
        this.clasificacionPabe = clasificacionPabe;
        this.c = c;
        this.p = p;
    }
    
}

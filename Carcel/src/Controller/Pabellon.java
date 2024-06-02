package Controller;
public class Pabellon {
    //ATRIBUTOS
    private int numeroPabe;
    private String tipoPabe;
    private Celda[] listaCeldas;

    //ATRIBUTOS
    public Pabellon(Celda[]listaCelda) {
        this.numeroPabe = 0;
        this.tipoPabe = null;
        this.listaCeldas = listaCelda;
    }
}

package reto3;

public class Residente {

    private String tipoDoc;
    private String documento;
    private String nombres;
    private String apellidos;

    public Residente (String tipoDoc, String documento, String nombres, String apellidos){
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return tipoDoc +";" + documento+";" + nombres +";" + apellidos;
    }
}

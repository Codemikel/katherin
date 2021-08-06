package reto3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Apartamento {

    private String idApartamento;
    private String propietario;
    private Residente[] residentes;

    public Apartamento(String idApartamento, String propietario, Residente[] residentes){
        this.idApartamento = idApartamento;
        this.propietario = propietario;
        this.residentes = residentes;
    }

    public String verResumen(){
        return "[Resumen]\n"+
                "Apartamento: "+idApartamento+"\n"+
                "Propietario: "+propietario+"\n"+
                "Residentes: "+ Arrays.toString(residentes);
    }

    public String verResidentes(){
        return "[Residentes]\n"+
                "TipoDoc; Documento; Nombres; Apellidos\n"+
                residentes.tipoDoc+";"+residentes.documento+";"+residentes.nombres+";"+residentes.apellidos;
    }

    public String getIdApartamento() {
        return idApartamento;
    }

    public void setIdApartamento(String idApartamento) {
        this.idApartamento = idApartamento;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Residente[] getResidentes() {
        return residentes;
    }

    public void setResidentes(Residente[] residentes) {
        this.residentes = residentes;
    }
}

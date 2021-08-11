package reto3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Apartamento {

    private String idApartamento;
    private String propietario;
    private Residente[] residentes;

    public Apartamento(String idApartamento, String propietario){
        this.idApartamento = idApartamento;
        this.propietario = propietario;
    }

    public String verResumen(){
        System.out.println("[Resumen]\n"+
                "Apartamento: "+idApartamento+"\n"+
                "Propietario: "+propietario+"\n"+
                "Residentes:"+residentes.length);
        return null;
    }

    public String verResidentes(){
        System.out.println("[Residentes]\n"+
                "TipoDoc; Documento; Nombres; Apellidos\n"+
                residentes[0]+"\n"+
                residentes[1]);
        return null;
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

    public void setResidentes(Residente[] residentes) {
        this.residentes = residentes;
    }
}

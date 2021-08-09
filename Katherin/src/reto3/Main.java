package reto3;

public class Main {

    public static void main(String[] args) {
        Residente resi[] = {new Residente ("CC", "1098423154", "Marcela", "Pinto"), new Residente("CC", "1048156451","Mauricio", "Leal")};
        Apartamento apto = new Apartamento("15 - 06", "Alexander Lobo", resi);

        System.out.println(apto.verResumen());

        System.out.println("-----------------------------------");

        System.out.println(apto.verResidentes());
    }
}

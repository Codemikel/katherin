package reto2;

public class Triangulo {

    private double area;
    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double calculoArea(){
        area=((base*altura)/2);
        return area;
    }

    @Override
    public String toString() {
        return "El area es de: "+area;
    }
}

package reto4;

public class Inventario {

    private Producto producto;
    private int cantidad;

    public void agregarProducto(Producto producto){
        agregarProducto();

    }

    public void agregarProducto(String codigo, String nombre, String tipo){

        codigoProducto = codigo;
        nombreProducto = nombre;
        tipoProducto = tipo;

        Producto producto = new Producto(codigo, nombre, tipo);

        cantidad++;

    }

    public void descontarProducto(Producto producto){
        descontarProducto();
    }

    public void descontarProducto(){
        codigoProducto = codigo;
        nombreProducto = nombre;
        tipoProducto = tipo;

        if (cantidad>0){
            cantidad--;
        }
    }

    public String  verInventario(){
        return "[Cantidad de items por tipo]\n"+
                "Deportivo: "+cantidad+
                "Jueguetes: "+cantidad+
                "Higiene: "+cantidad;
    }
}

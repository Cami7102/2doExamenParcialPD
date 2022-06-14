package ejercicio5;

public class ProgramasAbiertos {
    String cantidad;

    public ProgramasAbiertos(){}

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public void showInfo(){
        System.out.println("*********RECURSOS**********");
        System.out.println("Cantidad de programas abiertos: " + cantidad);
    }
}

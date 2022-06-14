package ejercicio5;

public class Memoria {
    double capacidad;

    public Memoria(){}

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public void showInfo(){
        System.out.println("********RECURSOS**********");
        System.out.println("Capacidad de la memoria: " +capacidad);
    }
}

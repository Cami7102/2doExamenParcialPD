package ejercicio5;

public class CPU {
    double capacidad;

    public CPU(){}

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

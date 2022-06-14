package ejercicio2;

public class Administrativos extends Chat {
    private String nombre;
    private String cargo;

    public Administrativos(Canal canal) {
        super(canal);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void send(String msg) {
        canal.send(msg,this);
    }

    @Override
    public void received(String msg) {
        System.out.println("Administrativos received: ["+msg+"]");
    }
}

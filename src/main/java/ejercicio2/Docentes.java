package ejercicio2;

public class Docentes extends Chat {
    private String nombre;
    private String ci;

    public Docentes(Canal canal) {
        super(canal);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    @Override
    public void send(String msg) {
        canal.send(msg,this);
    }

    @Override
    public void received(String msg) {
        System.out.println("Docentes received: ["+msg+"]");
    }
}

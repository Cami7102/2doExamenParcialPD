package ejercicio2;

public class Estudiantes extends Chat {
    private String nombre;
    private String numeroMatricula;

    public Estudiantes(Canal canal) {
        super(canal);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public void send(String msg) {
        canal.send(msg,this);
    }

    @Override
    public void received(String msg) {
        System.out.println("Estudiantes received: ["+msg+"]");
    }
}

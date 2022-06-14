package ejercicio2;

public class Estudiantes extends ChatEducativo{
    private String nombre;
    private String numeroMatricula;

    public Estudiantes(Canal canal) {
        super(canal);
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

package ejercicio2;

public class Docentes extends Chat {
    private String nombre;
    private String ci;

    public Docentes(Canal canal) {
        super(canal);
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

package ejercicio2;

public class Administrativos extends Chat {
    private String nombre;
    private String cargo;

    public Administrativos(Canal canal) {
        super(canal);
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

package ejercicio2;

public abstract class ChatEducativo {
    protected Canal canal;

    public ChatEducativo(Canal canal){
        this.canal=canal;
    }

    public abstract void send(String msg);
    public abstract void received(String msg);
}

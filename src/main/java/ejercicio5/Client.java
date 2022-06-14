package ejercicio5;

public class Client {
    public static void main (String[] args) throws InterruptedException{
        Celular celu = new Celular();
        celu.setStateCelu(new Prendido());
        celu.resourceManager();
    }
}

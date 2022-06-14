package ejercicio5;

public class Apagado implements IStateCelu{


    @Override
    public void resourceManager(Celular celular) throws InterruptedException {
        System.out.println("INFO: Estado apagado: ");
        celular.getProgramasAbiertos().setCantidad("0");
        celular.getMemoria().setCapacidad(0);
        celular.getCpu().setCapacidad(0);
        celular.getProgramasAbiertos().showInfo();
        celular.getMemoria().showInfo();
        celular.getCpu().showInfo();
    }
}

package ejercicio5;

import java.util.Random;

public class Prendido implements IStateCelu{

    @Override
    public void resourceManager(Celular celular) throws InterruptedException {
        System.out.println("INFO: Estado prendido: ");
        double currentValue = celular.getCpu().getCapacidad();
        double progAbi = new Random().nextInt(100);
        celular.getProgramasAbiertos().setCantidad(String.valueOf(progAbi));
        while (celular.getCpu().getCapacidad() < 100){
            celular.getProgramasAbiertos().showInfo();
            celular.getMemoria().showInfo();
            celular.getCpu().showInfo();
            Thread.sleep(3000);
            currentValue=(currentValue+(progAbi*5/100));
            celular.getCpu().setCapacidad(currentValue);
        }
        celular.getCpu().setCapacidad(20);
    }
}

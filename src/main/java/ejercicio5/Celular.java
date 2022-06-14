package ejercicio5;

public class Celular {
    private IStateCelu stateCelu;
    private Memoria memoria;
    private CPU cpu;
    private ProgramasAbiertos programasAbiertos;

    public Celular() {
        memoria=new Memoria();
        memoria.setCapacidad(6);
        cpu=new CPU();
        cpu.setCapacidad(4);
        programasAbiertos=new ProgramasAbiertos();
        programasAbiertos.setCantidad("2");
        stateCelu = new Apagado();
    }

    public IStateCelu getStateCelu() {
        return stateCelu;
    }

    public void setStateCelu(IStateCelu stateCelu) {
        this.stateCelu = stateCelu;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public ProgramasAbiertos getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void setProgramasAbiertos(ProgramasAbiertos programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }

    public void resourceManager()throws InterruptedException{
        stateCelu.resourceManager(this);
    }
}

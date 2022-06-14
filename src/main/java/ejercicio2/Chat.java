package ejercicio2;

public abstract class Chat {
    protected Canal canal;
    private Estudiantes estudiantes;
    private Administrativos Administrativos;
    private Docentes docentes;

    public Chat(Canal canal){
        this.canal=canal;
    }

    public Canal getCanal() {
        return canal;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }

    public Estudiantes getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiantes estudiantes) {
        this.estudiantes = estudiantes;
    }

    public ejercicio2.Administrativos getAdministrativos() {
        return Administrativos;
    }

    public void setAdministrativos(ejercicio2.Administrativos administrativos) {
        Administrativos = administrativos;
    }

    public Docentes getDocentes() {
        return docentes;
    }

    public void setDocentes(Docentes docentes) {
        this.docentes = docentes;
    }

    public abstract void send(String msg);
    public abstract void received(String msg);
}

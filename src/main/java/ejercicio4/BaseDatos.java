package ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class BaseDatos {
    private List<Libros> listaLibros = new ArrayList<>();
    private IBaseDatos baseDatos;

    public BaseDatos() {}

    public void addLibro(Libros libros) {
        listaLibros.add(libros);
    }

    public List<Libros> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libros> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public IBaseDatos getBaseDatos() {
        return baseDatos;
    }

    public void setBaseDatos(IBaseDatos baseDatos) {
        this.baseDatos = baseDatos;
    }

    public void iniciarOrden(){
        baseDatos.ordenar(listaLibros);
    }
}

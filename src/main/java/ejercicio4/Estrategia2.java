package ejercicio4;

import java.util.List;

public class Estrategia2 implements IBaseDatos{
    @Override
    public void ordenar(List<Libros> base) {
        System.out.println("Ordenar por TITULO");
        for (Libros libros : base) {
            if(!libros.getTitulo().equals(libros.getTitulo())) {
                libros.showInfo();
            }
        }
    }
}

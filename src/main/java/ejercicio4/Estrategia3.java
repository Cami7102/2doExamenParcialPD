package ejercicio4;

import java.util.List;

public class Estrategia3 implements IBaseDatos{
    @Override
    public void ordenar(List<Libros> base) {
        System.out.println("Ordenar por CATEGORIA");
        for (Libros libros : base) {
            if(!libros.getCategoria().equals(libros.getCategoria())) {
                libros.showInfo();
            }
        }
    }
}

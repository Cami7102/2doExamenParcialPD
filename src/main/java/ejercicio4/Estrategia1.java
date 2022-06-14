package ejercicio4;

import java.util.List;

public class Estrategia1 implements IBaseDatos{
    @Override
    public void ordenar(List<Libros> base) {
        System.out.println("Ordenar por ID");
        for (Libros libros : base) {
            if(!libros.getId().equals(libros.getId())) {
                libros.showInfo();
            }
        }
    }
}

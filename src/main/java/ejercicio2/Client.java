package ejercicio2;

public class Client {
    public static  void main(String[] args) {
        ChatEducativo chatEducativo= new ChatEducativo();

        Estudiantes est = new Estudiantes(chatEducativo);
        est.setNombre("Carlos");
        est.setNumeroMatricula("12345");

        Estudiantes est1 = new Estudiantes(chatEducativo);
        est1.setNombre("Maria");
        est1.setNumeroMatricula("678910");

        Estudiantes est2 = new Estudiantes(chatEducativo);
        est2.setNombre("John");
        est2.setNumeroMatricula("159753");

        Administrativos adm = new Administrativos(chatEducativo);
        adm.setNombre("Johny");
        adm.setCargo("finanzas");

        Administrativos adm1 = new Administrativos(chatEducativo);
        adm1.setNombre("mario");
        adm1.setCargo("planificacion");

        Administrativos adm2 = new Administrativos(chatEducativo);
        adm2.setNombre("Johny");
        adm2.setCargo("personal");

        Docentes doc = new Docentes(chatEducativo);
        doc.setNombre("carla");
        doc.setCi("159753");

        Docentes doc1 = new Docentes(chatEducativo);
        doc1.setNombre("carla");
        doc1.setCi("159753");

        Docentes doc2 = new Docentes(chatEducativo);
        doc2.setNombre("carla");
        doc2.setCi("159753");

        chatEducativo.addToChat(est);
        chatEducativo.addToChat(est1);
        chatEducativo.addToChat(est2);
        chatEducativo.addToChat(adm);
        chatEducativo.addToChat(adm1);
        chatEducativo.addToChat(adm2);
        chatEducativo.addToChat(doc);
        chatEducativo.addToChat(doc1);
        chatEducativo.addToChat(doc2);

        est.send("Esto va para docentes");
        adm.send("Esto va para todos");
        doc.send("Esto va para los estudiantes");
    }
}

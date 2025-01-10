import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        asignatura Matematicas = new asignatura("Matematicas");
        asignatura Informatica = new asignatura("Informatica");
        asignatura Biologia = new asignatura("Biologia");
        asignatura Historia = new asignatura("Historia");

        ArrayList<asignatura> asignaturasAlex= new ArrayList<asignatura>();
        asignaturasAlex.add(Matematicas);
        asignaturasAlex.add(Biologia);
        

        profesor Alex = new profesor("123546789A", "Alex", 1500, null );

        ArrayList<asignatura> asignaturasRamiro = new ArrayList<asignatura>();
        asignaturasRamiro.add(Biologia);
        asignaturasRamiro.add(Historia);

        profesor Ramiro = new profesor("987654321A", "Ramiro", 2000, null)
    }
}

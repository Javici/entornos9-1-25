import java.util.ArrayList;

public class profesor {
    public String DNI;
    public String NombreProfe;
    public double Salario;
    public ArrayList<asignatura> listaAsignaturas = new ArrayList<asignatura>();

    public profesor(String dniProfe, String Nombre, double SalarioProfe, ArrayList<asignatura>listaAsignaturasProfe){
        System.out.println("Profesor " + Nombre);
        DNI = dniProfe;
        NombreProfe = Nombre;
        Salario = SalarioProfe;
        listaAsignaturas= listaAsignaturasProfe;


    }

    /*public asign(String NombreAsignatura){
        listaAsignaturas.add(NombreAsignatura);

    }*/
}


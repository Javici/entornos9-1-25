public class perro {
    public String Raza;
    public String Ladrido;

    public perro (String RazaPerro, String LadridoPerro){
        Raza = RazaPerro;
        Ladrido = LadridoPerro;
    }
    public perro (String RazaPerro){
        Raza = RazaPerro;
        Ladrido = "Guau";
    }
    public void ladrar (){
        System.out.println("el perro es "+ Raza + " y ladra " + Ladrido);
    }
}

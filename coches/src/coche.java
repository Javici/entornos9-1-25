public class coche {

    public String color;
    public int anyo;
    public String modelo;
    public String marca;


    public coche (String colorCoche, int anyoCoche, String modeloCoche, String marcaCoche){
        color = colorCoche;
        //if(anyo <0){
        //    anyo = 1990;
        //}else{
        anyo =anyoCoche;
        modelo = modeloCoche;
        marca = marcaCoche;
        System.out.println("dentro del constructor del coche");
    }
    
    public coche (int anyoCoche, String modeloCoche, String marcaCoche){
        color = "desconocido";
        anyo =anyoCoche;
        modelo = modeloCoche;
        marca = marcaCoche;
        System.out.println("dentro del constructor del coche");
    }
    public coche (int anyoCoche, String marcaCoche){
        color = "desconocido";
        anyo =anyoCoche;
        modelo = "desconocido";
        marca = marcaCoche;
        System.out.println("dentro del constructor del coche");

}
}
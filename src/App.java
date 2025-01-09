public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        coche coche1= new coche();

        coche1.color = "rojo";
        coche1.anyo = 1995;
        coche1.modelo = "SF90";
        coche1.marca = "Ferrari";

        System.out.println(coche1);
    }
}

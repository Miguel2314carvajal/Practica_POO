public class Carta {
    //Atributos
    private String Nombre;

    public Carta (String Nombre){
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void jugar(){
        System.out.println("Usted esta jugando");

    }

    public void mostrarDescripcion(){
        System.out.println("El Nombre de su carta es: "+Nombre);
    }
}

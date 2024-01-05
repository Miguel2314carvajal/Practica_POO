public class CartaNumerica extends Carta {
    //Atributos
    private int Numero;


    public CartaNumerica(String Nombre, int Numero) {
        super(Nombre);
        this.Numero = Numero;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    double numCambio = (double) Numero;

    @Override
    public void mostrarDescripcion() {
        super.mostrarDescripcion();
        System.out.println("El numero de su carta es: "+Numero);
    }

    @Override
    public void jugar(){
        System.out.println("Su carta sumado 50 es igual: ");
        System.out.println(Numero+numCambio+50);
    }

}

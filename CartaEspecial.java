public class CartaEspecial extends Carta{
    //Atributos

    public CartaEspecial(String Nombre) {
        super(Nombre);
    }

    public void activarEfectoEspecial(){
        try {
            System.out.println("El efecto de carta especial esta activado");
        }catch (Exception e){
            System.out.println("Error");

        }

    }

}


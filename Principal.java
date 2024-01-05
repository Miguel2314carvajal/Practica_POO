public class Principal {
    public static void main(String [] args) {
        Carta carta1 = new Carta("As");
        carta1.mostrarDescripcion();
        carta1.jugar();
        System.out.println("\n");
        CartaNumerica cartaNumerica1 = new CartaNumerica("Trebol", 30);
        cartaNumerica1.mostrarDescripcion();
        cartaNumerica1.jugar();
        System.out.println("\n");
        CartaEspecial cartaEspecial1 = new CartaEspecial("Corazones Negros");
        cartaEspecial1.activarEfectoEspecial();
    }
}

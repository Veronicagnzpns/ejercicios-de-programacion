public class Coche extends Vehiculo {
    private int cilindrada; // cilindrada en cm3

    public Coche(int c) {
        super();
        this.cilindrada = c;
    }

    public void quemaRueda() {
        System.out.println("Mira como quemo rueda");
    }
}
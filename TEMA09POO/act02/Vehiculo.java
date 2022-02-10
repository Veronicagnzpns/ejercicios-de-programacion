public abstract class Vehiculo {
    /** ATRIBUTOS DE CLASE **/
    private static int KilometrosTotales = 0;
    private static int vehiculosCreados = 0;

    /** ATRIBUTOS DE INSTANCIA **/
    private int kilometrosRecorridos;

    public Vehiculo() {
        this.kilometrosRecorridos = 0;
    }

    public int getKilometrosRecorridos() {
        return this.kilometrosRecorridos;
    }

    public static int getKilometrosTotales() {
        return Vehiculo.KilometrosTotales;
    }

    public void recorre(int k) {
        this.kilometrosRecorridos += k;
        Vehiculo.KilometrosTotales += k;
    }
}

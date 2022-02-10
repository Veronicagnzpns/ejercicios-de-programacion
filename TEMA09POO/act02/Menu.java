public class Menu {

    public static void main(String[] args) {
        int opcion = 0;
        int km;

        Bicicleta bici1 = new Bicicleta(9);
        Coche coche1 = new Coche(1900);

        while (opcion != 8) {
            System.out.println("VEHICULOS");
            System.out.println("=============");
            System.out.println("1.Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.println("Elige una opción (1-8)");

            opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {
                case 1:
                    System.out.println("¿Cuantos kilometros quiere que recorra?");
                    km = Integer.parseInt(System.console().readLine());
                    bici1.recorre(km);
                    break;
                case 2:
                    bici1.caballito();

                    break;
                case 3:
                    System.out.println("¿Cuantos kilometros quiere que recorra?");
                    km = Integer.parseInt(System.console().readLine());
                    coche1.recorre(km);
                    break;
                case 4:
                    coche1.quemaRueda();

                    break;
                case 5:
                    System.out.println("La bicicleta tiene ");
                    System.out.println(bici1.getKilometrosRecorridos() + " km");

                    break;
                case 6:
                    System.out.println("El coche tiene ");
                    System.out.println(coche1.getKilometrosRecorridos() + " km");

                    break;
                case 7:
                    System.out.println("En total ");
                    System.out.println(Vehiculo.getKilometrosTotales() + " km");

                default:

            }
        }
    }
}

public class Act07{
  public static void main(String[] args) {
    double primerExamen;
    double segundoExamen;
    double tercerExamen;
    System.out.print("\nEste programa resuelve ecuaciones de primer grado del tipo ax+b=0 ");
    System.out.print("\nPorfavor, introduzca el valor de la primera nota: ");
        primerExamen = Double.parseDouble(System.console().readLine());
        System.out.print("ahora introduzca el valor de el segundo examen: ");
        segundoExamen = Double.parseDouble(System.console().readLine());
          System.out.print("y por ultimo introduzca el valor de el tercer examen: ");
        tercerExamen = Double.parseDouble(System.console().readLine());
  System.out.println("La nota media es: " + (primerExamen+segundoExamen+tercerExamen)/3);
  }
}


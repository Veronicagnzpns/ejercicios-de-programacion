public class Act08{
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
        double media= (primerExamen+segundoExamen+tercerExamen)/3;
  if (media<=4){
    System.out.println("La nota media es: " + media +" , insuficiente");
  } else if (media==5) {
    System.out.println("La nota media es: " + media +" , suficiente");
    } else if ((media>=6) && (media<=7)){
    System.out.println("La nota media es: " + media +" , bien");
    } else if ((media>=8) && (media<=9)){
    System.out.println("La nota media es: " + media +" , notable");
    } else if (media==10){
    System.out.println("La nota media es: " + media +" , sobresaliente");
    } 
  }
}

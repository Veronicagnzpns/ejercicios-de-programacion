public class Act1 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt( linea );
    
    System.out.print("introduce otro número, por favor: ");
    linea = System.console().readLine();
    int segundoNumero;
    segundoNumero = Integer.parseInt( linea );
    
    int total;
    total= primerNumero * segundoNumero ;
    
    System.out.println("El primer número introducido es: " + primerNumero);
    System.out.println("El segundo número introducido es: " + segundoNumero);
    System.out.println("La multiplicación de ambos números es:" + total);
    
    }
    }

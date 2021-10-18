public class Act4 { // Clase principal
  public static void main(String[] args) {
    String numero;
    System.out.print("Por favor, introduce un número: ");
    numero = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt(numero);
    
    System.out.print("Por favor, introduce otro número: ");
    numero = System.console().readLine();
    int segundoNumero;
    segundoNumero = Integer.parseInt(numero);
    double suma= primerNumero+segundoNumero;
    double resta=primerNumero-segundoNumero;
    double multiplicacion=primerNumero*segundoNumero;
    double division=primerNumero/segundoNumero;
    
    
    
    System.out.println("La suma de ambos numeros es: "+ suma);
    System.out.println("La resta de ambos numeros es: "+ resta);
    System.out.println("La multiplicación de ambos numeros es: "+ multiplicacion);
    System.out.println("La divisón de ambos numeros es: "+ division);
    
  }
}

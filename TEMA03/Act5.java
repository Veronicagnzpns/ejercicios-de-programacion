public class Act5 { // Clase principal
  public static void main(String[] args) {
    String numero;
    System.out.print("Por favor, introduce la medida de la altura: ");
    numero = System.console().readLine();
    int altura;
    altura = Integer.parseInt(numero);
    
    System.out.print("Por favor, introduce la medida de la base: ");
    numero = System.console().readLine();
    int base;
    base = Integer.parseInt(numero);
    double area = base*altura;
    
    
    
    
    System.out.println("La area del rectangulo es: "+ area);
   
    
  }
}

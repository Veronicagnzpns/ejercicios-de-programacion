public class Act05 { // Clase principal
  public static void main(String[] args) {
    String numero;
    System.out.print("Por favor, introduce la medida de la altura: ");
    numero = System.console().readLine();
    int lado1;
    lado1 = Integer.parseInt(numero);
    
    System.out.print("Por favor, introduce la medida de la base: ");
    numero = System.console().readLine();
    int lado2;
    lado2 = Integer.parseInt(numero);
    double area = lado1*lado2;
    
    
    
    
    System.out.println("La area del rectangulo es: "+ area);
   
    
  }
}

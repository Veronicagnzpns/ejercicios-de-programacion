

public class Act2 { // Clase principal
  public static void main(String[] args) {
    String dinero;
    System.out.print("Por favor, introduce una cantidad de euros: ");
    dinero = System.console().readLine();
    int euros;
    euros = Integer.parseInt( dinero);
    double pesetas = euros*166.386;
    System.out.println(euros+" euros son "+pesetas+" pesetas");
    
  }
}

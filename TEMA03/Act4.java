public class Act4 { // Clase principal
  public static void main(String[] args) {
    String dinero;
    System.out.print("Por favor, introduce una cantidad de pesetas: ");
    dinero = System.console().readLine();
    int pesetas;
    pesetas = Integer.parseInt( dinero);
    double euros = pesetas/166.386;
    System.out.println(pesetas+" pesetas son "+euros+" euros");
    
  }
}

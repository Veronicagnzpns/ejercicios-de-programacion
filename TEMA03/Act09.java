public class Act09 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Por favor, introduce la medida de la altura: ");
    double altura = Integer.parseInt(System.console().readLine());
        System.out.print("Por favor, introduce la medida de el radio: ");
    double radio = Integer.parseInt(System.console().readLine());
  
    double volumen = ((1.0/3.0)*3.14*(radio*radio))*altura;
    
    
    
    
    System.out.printf(" El volumnen de un cono es : %.6f  ", volumen);
    
    
  }
}

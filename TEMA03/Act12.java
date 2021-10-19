public class Act12 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Por favor, introduce la nota del primer examen: ");
    double primerExamen = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduce la nota que desea obtener: ");
    double nota = Double.parseDouble(System.console().readLine());
  
    double total =((nota-(primerExamen*0.40))/0.60);
    
    
    
    
    System.out.printf(" la nota que debes sacar es de:  "+ total);
    
    
  }
}

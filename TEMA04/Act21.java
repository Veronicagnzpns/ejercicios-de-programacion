public class Act21 { 
  public static void main(String[] args) {
    System.out.print("Por favor, introduce la nota del primer examen: ");
    double primerExamen = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduce la nota que desea obtener: ");
    double segundoExamen = Double.parseDouble(System.console().readLine());
  
    double total =((primerExamen+segundoExamen)/2);
    
    if (total>=5){
      System.out.print("enhorabuena tu nota media es: "+total);
      } else if (total<5){
          
          System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
          String recuperacion = System.console().readLine();
          
           String recu;

          switch (recuperacion) {
            case "apto":
              recu = "Tu nota de Programación es 5";
              break;
            case "no apto":
              recu = "Tu nota de Programación es: "+total;
              break;
            default:
              recu = "no existe ";
             
          }

     System.out.println(recu);
        
    
    
  }
}
}

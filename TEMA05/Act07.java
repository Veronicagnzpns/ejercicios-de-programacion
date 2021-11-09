public class Act07 {
  public static void main(String[] args) {
    int cod=1234;
  
    for (int i = 0; i <4; i++) {
        System.out.print("Dime un número de 4 cifras: ");
       int n = Integer.parseInt(System.console().readLine());
  
     if ( !(cod==n) ) {
      if (i<3){ System.out.println("Lo siento, esa no es la combinación");}
      else { System.out.println("Lo siento, esa no es la combinación Y A AGOTADO EL Nº DE INTENTOS.");}
      
       } 
     if( cod == n ){
          System.out.println("La caja fuerte se ha abierto satisfactoriamente");
          i=5;
         }
        
    }
     

  }
}

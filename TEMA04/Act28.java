public class Act28 {

  public static void main(String[] args) {
    
   
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera):");
      String jugador1 = System.console().readLine();
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera):");
      String jugador2 = System.console().readLine();
   
   
     
     
      int carta=0;
       switch (jugador1) {
            case "papel":
            carta=0;
              break;
              
            case "piedra":
            carta=2;
              break;
              
             case "tijera":
             carta=1;
              
              break;

            default:
          }
        int mano=0;    
        switch (jugador2) {
            case "papel":
            mano=0;
              break;
              
            case "piedra":
            mano=2;
              break;
              
             case "tijera":
             mano=1;
              
              break;

            default:   
          }
               
        
        if (carta>mano){
          System.out.printf("jugador 1 gana"); 
          }
        if (carta<mano){
          System.out.printf("jugador 2 gana"); 
          }
          if (carta == mano){
          System.out.printf("empate"); 
          }
            
 }
}



public class Act10 {

  public static void main(String[] args) {
 
    int[][] n = new int[3][3];
    int capa;
    int i;
    int j;
    int aux1;
    int aux2;

      // Pinta el cuadrante
      for(y = 3; y >= 0; y--) {
        System.out.print(y + "|");  
        for(x = 0; x < 3; x++) {
          if (cuadrante[x][y] == INTENTO) {
            System.out.print("X ");
          } else { 
            System.out.print("  ");
          }
        }
        System.out.println();   
      }
      System.out.println("  ----------\n  0 1 2 3 4\n");




    
  }
}

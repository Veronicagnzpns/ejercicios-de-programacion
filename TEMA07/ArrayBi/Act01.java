
public class Act01{
  public static void main(String[] args) 
    throws InterruptedException { // Se añade esta línea para poder usar sleep
       
      int[][] n = new int[3][6]; // array de 3 filas por 2 columnas

      n[0][1] = 30;
      n[0][2] = 2;
      n[0][5] = 5;
      n[1][0] = 75;
      n[2][2] = -2;
      n[2][3] = 9;
      n[2][5] = 11;
      
      int fila;
      int columna;
      
      for(fila = 0; fila < 3; fila++) {

        System.out.print("Fila: " + fila);
    
        for(columna = 0; columna < 6; columna++) {
          System.out.printf("%10d ", n[fila][columna]);
          Thread.sleep(1000); // retardo de un segundo
        }
        System.out.println();    
      }
    }
}

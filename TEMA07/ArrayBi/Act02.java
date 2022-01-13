
public class Act02{
  public static void main(String[] args) 
  
    throws InterruptedException { 
       System.out.println("--------------SUMA FILAS Y COLUMAS CON TOTAL------------- ");
      int[][] n = new int[4][5]; 
      
      int fila;
      int columna;
      
      for(fila = 0; fila < 4; fila++) {
      for(columna = 0; columna < 5; columna++) {
        System.out.print("Fila " + fila + ", columna " + columna + ": ");
        n[fila][columna] = Integer.parseInt(System.console().readLine());
      }
    }
    int sumaFila;
    for(fila = 0; fila < 4; fila++) {
      sumaFila = 0;
      for(columna = 0; columna < 5; columna++) {
        System.out.printf("  "+ n[fila][columna]);
        sumaFila += n[fila][columna];
      }
      System.out.println( "  "+sumaFila);
      
    }

    int sumaColumna;
    int sumaTotal = 0;
    for(columna = 0; columna < 5; columna++) {
      sumaColumna = 0;
      for(fila = 0; fila < 4; fila++) {
        sumaColumna += n[fila][columna];
      }

      sumaTotal += sumaColumna;
      System.out.printf("  "+ sumaColumna);
    }
    System.out.printf("  "+ sumaTotal);
  }
}
      
    


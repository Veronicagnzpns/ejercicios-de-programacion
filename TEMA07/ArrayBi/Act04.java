public class Act04{
  public static void main(String[] args) 
  
    throws InterruptedException { 
       System.out.println("--------------SUMA FILAS Y COLUMAS CON TOTAL (ALEATORIO)------------- ");
      int[][] n = new int[4][5]; 
      
      int fila;
      int columna;
      
      for(fila = 0; fila < 4; fila++) {
      for(columna = 0; columna < 5; columna++) {
        n[fila][columna] = ((int)(Math.random() * 1000)+100);
      }
    }
    int sumaFila;
    for(fila = 0; fila < 4; fila++) {
      sumaFila = 0;
      for(columna = 0; columna < 5; columna++) {
        System.out.printf("%7d  ", n[fila][columna]);
        sumaFila += n[fila][columna];
      }
      Thread.sleep(1000); 
      System.out.printf( "%7d\n", sumaFila);
      Thread.sleep(1000); 
      
      
    }

    int sumaColumna;
    int sumaTotal = 0;
    for(columna = 0; columna < 5; columna++) {
      sumaColumna = 0;
      for(fila = 0; fila < 4; fila++) {
        sumaColumna += n[fila][columna];
        Thread.sleep(1000); 
      }
       Thread.sleep(1000); 
      sumaTotal += sumaColumna;
      System.out.printf("%7d  ",  sumaColumna);
    }
    System.out.printf("%7d  ",  sumaTotal);
  }
}
  

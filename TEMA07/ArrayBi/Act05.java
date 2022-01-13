public class Act05{
  public static void main(String[] args) 
  
    throws InterruptedException { 
       System.out.println("--------------ARRAY ALEATORIO CON POSICION DE MAX Y MIN------------- ");
      int[][] n = new int[6][10]; 
      
      int fila;
      int columna;
      int max=0;
      int min=1000;
      int nFilaMax=0;
      int nColumnaMax=0;
      int nFilaMin=0;
      int nColumnaMin=0;
      
      for(fila = 0; fila < 6; fila++) {
      for(columna = 0; columna < 10; columna++) {
        n[fila][columna] = ((int)(Math.random() * 1000+1));
        if(n[fila][columna]>max){
          max=n[fila][columna];
          nFilaMax=fila;
          nColumnaMax=columna;
          }
        if(n[fila][columna]<min){
          min=n[fila][columna];
          nFilaMin=fila;
          nColumnaMin=columna;
          }
    }
  }
    for(fila = 0; fila < 6; fila++) {
      for(columna = 0; columna < 10; columna++) {
        System.out.printf("%7d  ", n[fila][columna]);
      }
      System.out.println();
    }
    System.out.println();
    System.out.println("El numero max es "+ max +" que se encientra en la fila "+ nFilaMax +" y en la columna "+ nColumnaMax);
    System.out.printf("El numero max es "+ min +" que se encientra en la fila "+ nFilaMin +" y en la columna "+ nColumnaMin);

  }

}



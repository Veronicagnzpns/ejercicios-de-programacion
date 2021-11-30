public class Act05 {
  public static void main(String[] args) {
    System.out.println("-----------------10 NUMEROS 1MAXIMO Y 1MINIMO------------------- ");

    int[] n = new int[10];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    
    System.out.println("Introduzca 10 numeros por teclado dando al intro: ");

    for (int i = 0; i < 10; i++) {
      n[i] = Integer.parseInt(System.console().readLine());
     
      if(n[i]<minimo){
        minimo=n[i];
        }
       
      if(n[i]>maximo){
        maximo=n[i];
        }
      
    }
    
    for(int i=0;i<10;i++){
      System.out.printf("numero[%2d] %11d  ",i,n[i]);
      
      if(n[i]==minimo){
        System.out.println("minimo");
        }
      
      if(n[i]==maximo){
        System.out.println("maximo");
        }
      System.out.println();
  }
 
     
}
}

public class Act14 {
  public static void main(String[] args) {
   
   
    System.out.print("Porfavor introduzca la base: ");
    int  base = Integer.parseInt(System.console().readLine());
     System.out.print("Porfavor introduzca el exponente: ");
    int  exponente = Integer.parseInt(System.console().readLine());
    int base2=0;
    
    for(int base1=base; (exponente-1) >0 ;exponente-- )  {
      base2=base1*base;
      base1=base2;
      
    }
      System.out.printf("El resultado de ese numero es: %8d",base2);
  }
}

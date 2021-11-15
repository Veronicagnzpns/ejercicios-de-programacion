public class Act15 {
  public static void main(String[] args) {
   
   
    System.out.print("Porfavor introduzca la base: ");
    int  base = Integer.parseInt(System.console().readLine());
     System.out.print("Porfavor introduzca el exponente: ");
    int  exponente = Integer.parseInt(System.console().readLine());
    
    for( int base2=0 ; (exponente) >0 ; exponente--)  {
     int exponente1=exponente;
     if(exponente1>1){
       for(int base1=base; (exponente1-1) >0 ;exponente1-- )  {
      base2=base1*base;
      base1=base2;
      }
    }else if (exponente1==1){
    base2=base;
    }
    
    System.out.printf("%4d˄%2d = %8d\n",base,exponente,base2);
    }
    
      }
}

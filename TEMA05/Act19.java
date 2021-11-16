public class Act19 {
  public static void main(String[] args) {
   
   
    System.out.print("Porfavor introduzca la altura: ");
    int  h = Integer.parseInt(System.console().readLine());
    System.out.print("Porfavor introduzca el caracter: ");
    String simbolo = System.console().readLine();
    int escrito=1;
   
      while( h>=1 )  {
        for(int espacios= h-1; espacios>=0;espacios--){
          System.out.print(" ");
        }
        for (int i=1;i<=escrito;i++ ){
          System.out.print(simbolo);
          

        }
       System.out.println();
       h--;
       escrito +=2;
      }
      
      
    

    }
    
}

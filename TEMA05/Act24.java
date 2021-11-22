public class Act24 {
  public static void main(String[] args) {
   
    System.out.print("PIRAMIDE DE NUMEROS");

    System.out.print("Porfavor introduzca la altura: ");
    
    int  hIntro = Integer.parseInt(System.console().readLine());
    int espacios= hIntro-1;
    int h =1;
    int i=0;
    
    while( h<hIntro )  {
      for(i=1 ; i<=espacios ;i++){
        System.out.print(" ");
      }
      
      for (i=1;i<h;i++ ){
        System.out.print(i);
          
      }
       
      for ( i=h;i>0;i-- ){
        System.out.print(i);
      }

       System.out.println();
       h++;
       espacios--;
      
      }

    }
    
}

public class Act20 {
  public static void main(String[] args) {
   
    System.out.print("PIRAMIDE HUECA");
   
    System.out.print("Porfavor introduzca la altura: ");
    int  hIntro = Integer.parseInt(System.console().readLine());
    System.out.print("Porfavor introduzca el caracter: ");
    String simbolo = System.console().readLine();
    int escrito=0;
    int h=1;
    int espacios= hIntro-1;
   
      while( h<hIntro )  {
        for(int i=1; i<=espacios ;i++){
          System.out.print(" ");
        }
        System.out.print(simbolo);

        for (int i=1;i<escrito;i++ ){
          System.out.print(" ");
        }
        if (h>1) {
        System.out.print(simbolo);
        }
        

       System.out.println();
       h++;
       escrito +=2;
       espacios--;
      }
      for (int i = 1; i < h*2; i++) {
      System.out.print(simbolo);
    }
      
      
    

    }
}

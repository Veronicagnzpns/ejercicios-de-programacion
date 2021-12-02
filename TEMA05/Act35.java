public class Act35 {
  public static void main(String[] args) {
   
    System.out.print("----------------PINTAMOS UNA X CON SU ALTURA----------------\n");
   
    System.out.print("Porfavor introduzca la altura: ");
    int  hIntro = Integer.parseInt(System.console().readLine());
    
    int escrito=hIntro-1;
    int h=1;
    int espacios=0;
    
    int h1=1;
    int escrito1=0;
    int espacios1=hIntro/2;
    if(hIntro<3 || hIntro%2 ==0){
      System.out.print("el número introducido no es valido introduzca un número mayor de tres e impar.");
    }else{

      while( h<hIntro/2+1)  {
        for(int i=1; i<=espacios ;i++){
          System.out.print(" ");
        }
        System.out.print("*");

        for (int i=1;i<escrito;i++ ){
          System.out.print(" ");
        }
        System.out.print("*");
        

        System.out.println();
        h++;
        espacios++;
        escrito-=2;
       
      }
      
      while( h1<=hIntro/2+1)  {
        for(int i=1; i<=espacios1 ;i++){
          System.out.print(" ");
        }
        System.out.print("*");

        for (int i=1;i<escrito1;i++ ){
          System.out.print(" ");
        }
        if (h1>1) {
          System.out.print("*");
        }
        

        System.out.println();
        h1++;
        escrito1 +=2;
        espacios1--;
      }
      
    }
  }
}

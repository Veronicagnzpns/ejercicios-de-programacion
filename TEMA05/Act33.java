public class Act33 {
  public static void main(String[] args) {
       System.out.print("-----------------PINTAMOS UNA L CON SU ALTURA---------------------\n");

   
    System.out.print("Porfavor introduzca la altura de la U: ");
    int  h = Integer.parseInt(System.console().readLine());
   
 

    for(int i=1;i<(h);i++)  {
      System.out.print("* ");
      for(int i2=2;i2<h;i2++){
        System.out.print("  ");
        }
      System.out.println("*");
    }
 
    System.out.printf("  ");
    for(int i=2;i<h;i++)  {
      System.out.printf("* ");
      
    }
  }
}

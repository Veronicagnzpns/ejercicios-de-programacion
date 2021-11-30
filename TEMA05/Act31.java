public class Act31 {
  public static void main(String[] args) {
       System.out.print("-----------------PINTAMOS UNA L CON SU ALTURA---------------------\n");

   
    System.out.print("Porfavor introduzca la altura de la L: ");
    int  h = Integer.parseInt(System.console().readLine());
   
 

    for(int i=0;i<h;i++)  {
      System.out.println();
      System.out.printf("*");
      
    }
    for(int i=0;i<((h/2));i++)  {
      System.out.printf(" * ");
      
    }
  }
}

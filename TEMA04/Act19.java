public class Act19{
  public static void main(String[] args) {
    int n;
   
    System.out.print("Porfavor introduzca un numero entero: ");
        n = Integer.parseInt(System.console().readLine());
    if (n<10){   
       System.out.println("Tiene 1 digito");
      
      } else if ((n>=10) && (n<100))  {
        System.out.println("tiene 2 digitos");
      
      } else if ((n>=100)&&(n<1000)) {
        System.out.println("eTiene 3 dijitos");
      
      }else if ((n>=1000)&&(n<10000)) {
      System.out.println("Tiene 4 digitos");
      
      }else if ((n>=10000)&&(n<100000)) {
      System.out.println("Tiene 5 digitos");
      
      } 
    }
}


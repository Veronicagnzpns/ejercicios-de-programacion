public class Act18{
  public static void main(String[] args) {
    int n;
   
    System.out.print("Porfavor introduzca un numero entero: ");
        n = Integer.parseInt(System.console().readLine());
    if (n<10){   
       System.out.println("el primer numero es " + (n));
      
      } else if ((n>=10) && (n<100))  {
        System.out.println("el primer numero es " + (n/10));
      
      } else if ((n>=100)&&(n<1000)) {
        System.out.println("el primer numero es " + (n/100));
      
      }else if ((n>=1000)&&(n<10000)) {
      System.out.println("el primer numero es " + (n/1000));
      
      }else if ((n>=10000)&&(n<100000)) {
      System.out.println("el primer numero es " + (n/10000));
    }
}
}

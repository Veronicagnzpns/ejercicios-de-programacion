public class Act11 {
  public static void main(String[] args) {
   
   
    System.out.print("Porfavor introduzca un numero entero: ");
    int  base = Integer.parseInt(System.console().readLine());
     System.out.print("Porfavor introduzca un numero entero: ");
    int  exponente = Integer.parseInt(System.console().readLine());
    int base1=0;
    for(exponente ; exponente >0 ; base1=base*base;)  {
      int base2=base1*base;
      base2=base1;
    System.out.printf("%8d",base2);
    exponente--;
    }
   
  }
}

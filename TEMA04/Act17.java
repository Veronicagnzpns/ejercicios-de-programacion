public class Act17{
  public static void main(String[] args) {
    int n;
   
    System.out.print("Porfavor introduzca un numero entero: ");
        n = Integer.parseInt(System.console().readLine());
        
  System.out.println("el ultimo numero es " + (n % 10));
  }
}

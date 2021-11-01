public class Act20 {

  public static void main(String[] args) {
    
    int n;
       System.out.print("Porfavor introduzca un numero entero: ");
        n = Integer.parseInt(System.console().readLine());
        
    if (n < 10) {
      System.out.print("Capicua ");
    
    } else if((n >= 10) && (n < 100)) { 
      if ((n / 10) == (n % 10)) {
        System.out.print("Capicua ");
      }
    } else if ((n >= 100) && (n < 1000)) {
      if ((n / 100) == (n % 10)) {
        System.out.print("Capicua ");
      }
    } else if ((n >= 1000) && (n < 10000)) {
      if (((n / 1000) == (n % 10)) && ((( n / 100 ) % 10)== (( n / 10) % 10))) {
        System.out.print("Capicua ");
      }
    } else if (n >= 10000) { 
      if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
        System.out.print("Capicua ");
      }
    } else {
      System.out.println("El número introducido no es capicúa.");
    }
  }
}

public class Act09{
  public static void main(String[] args) {
    int i = 0;
    System.out.print("Dime un número: ");
       int n = Integer.parseInt(System.console().readLine());
    do {
      n= n/10;
      i++;
    } while (n > 0);
        System.out.print("El numero anterior tiene "+i);
        System.out.print(" digitos");


  }
}

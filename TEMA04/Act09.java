public class Act5{
  public static void main(String[] args) {
    double a;
    double b;
    double c;
    System.out.print("\nEste programa resuelve ecuaciones de primer grado del tipo ax+b=0 ");
    System.out.print("\nPorfavor, introduzca el valor de a: ");
        a = Double.parseDouble(System.console().readLine());
        System.out.print("ahora introduzca el valor de b: ");
        b = Double.parseDouble(System.console().readLine());
        System.out.print("ahora introduzca el valor de c: ");
        c = Double.parseDouble(System.console().readLine());
    if ( a>0){
        System.out.println("El resultado de x es " + ((-b)(Math.sqrt((b*b)-(4*a*c))/(2*a));
}   else {
  System.out.println("El resultado de la ecuación no tine solución real");
  }
}
}

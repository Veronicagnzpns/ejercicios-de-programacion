public class Act05{
  public static void main(String[] args) {
    double a;
    double b;
    System.out.print("\nEste programa resuelve ecuaciones de primer grado del tipo ax+b=0 ");
    System.out.print("\nPorfavor, introduzca el valor de a: ");
        a = Double.parseDouble(System.console().readLine());
        System.out.print("ahora introduzca el valor de b: ");
        b = Double.parseDouble(System.console().readLine());
    if ( a==0){
        System.out.println("El resultado de la ecuación no tine solución real");
        }else {
         System.out.println("El resultado de x es " + ((-b )/a));
         }
}
}

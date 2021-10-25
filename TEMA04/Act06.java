public class Act06{
  public static void main(String[] args) {
    double h;
    double g = 9.81;
    System.out.print("\nEste programa resuelve ecuaciones de primer grado del tipo ax+b=0 ");
    System.out.print("\nPorfavor, introduzca el valor de h: ");
        h = Double.parseDouble(System.console().readLine());
        double tiempo = Math.sqrt(2*h/g);
  System.out.println("El resultado de t es " + tiempo +" s");
  }

}

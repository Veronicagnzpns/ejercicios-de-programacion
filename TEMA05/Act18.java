public class Act18 {
  public static void main(String[] args) {
       System.out.print("MUESTRA NUMEROS INTERMEDIO DE 7 EN 7\n ");

   
    System.out.print("Porfavor introduzca un número: ");
    int  n1 = Integer.parseInt(System.console().readLine());
     System.out.print("Porfavor introduzca un número: ");
    int  n2 = Integer.parseInt(System.console().readLine());
    int ntotal=0;
 

    for(ntotal=0;(ntotal<n2);)  {
      ntotal=n1+7;
      n1=ntotal;
      System.out.printf("%8d\n",(ntotal-7));

    }
  }
}

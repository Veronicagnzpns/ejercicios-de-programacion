public class Act11 {
  public static void main(String[] args) {
   
   
    System.out.print("Porfavor introduzca un numero entero: ");
    int  n = Integer.parseInt(System.console().readLine());
    System.out.print("Porfavor introduzca un numero entero: ");
    int  n = Integer.parseInt(System.console().readLine());
    for(int repeticiones=5 ; repeticiones >0 ; n++)  {
      
    System.out.printf("%4d  %8d  %8d\n",n,n*n,n*n*n);
    repeticiones -=1;
    }
   
  }
}

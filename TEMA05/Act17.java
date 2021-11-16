public class Act17 {
  public static void main(String[] args) {
   
   
    System.out.print("Porfavor introduzca un numero entero: ");
    int  n = Integer.parseInt(System.console().readLine());
    int n1=0;
    int n2=0;
    if (n>=0){
      for(int repeticiones=100 ; repeticiones >0 ; n++)  {
        n2=n+n1;
        n1=n2;
        repeticiones -=1;
      }
      System.out.printf("La suma de los 100 numeros siguientes es = "+n2);

    } else { 
      System.out.print("El número introducido no es correcto.");
      }
    

    }
    
}


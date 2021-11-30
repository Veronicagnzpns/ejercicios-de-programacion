public class Act32 {
  public static void main(String[] args) {
       System.out.print("-----------------CAPTA LOS NUMEROS PARES Y LOS SUMA---------------------\n");

   
    System.out.print("Porfavor introduzca un numero entero positivo: ");
    long  n = Long.parseLong(System.console().readLine());
   //Para ver los numeros pares 1º ahi que darle la vuelta al numero para cuando obtengamos los pares salgan en el orden correcto.
    int longitud=0;
    int volteado=0;
    int nPares=0;
    int sumaPares=0;
    
    if(n==0){
      longitud=1;
      }
      
    while(n>0){
      volteado=(volteado*10)+(int)(n%10);
      n/=10;
      longitud++;
      }
    System.out.print("Los números pares encontrados en este numero son: ");

     for (int i = 0; i < longitud; i++) {

      nPares = (int)(volteado % 10);

      if ((nPares % 2) == 0) {
        System.out.print(nPares+ " ");
        sumaPares += nPares;
      }

      volteado /= 10;
    }
    System.out.println();
    System.out.print("La suma de estos es igual a: "+ sumaPares);
    
 
  }
}

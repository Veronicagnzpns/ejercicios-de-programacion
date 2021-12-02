public class Act34 {
  public static void main(String[] args) {
       System.out.print("-----------------CAPTA LOS NUMEROS PARES E IMPARES DE DOS NUMEROS Y LOS UNE---------------------\n");

   
    System.out.print("Porfavor introduzca un numero entero positivo: ");
    long  n = Long.parseLong(System.console().readLine());
    
    System.out.print("Porfavor introduzca otro numero entero positivo: ");
    long  n1 = Long.parseLong(System.console().readLine());
    
   //Para ver los numeros pares 1º ahi que darle la vuelta al numero para cuando obtengamos los pares salgan en el orden correcto.
    int longitud=0;
    int volteadoPar=0;
    int nPares=0;
    int nImpares=0;
    int volteadoImpar=0;
    
    int longitud1=0;
    int volteadoPar1=0;
    int nPares1=0;
    int nImpares1=0;
    int volteadoImpar1=0;
    
    if(n==0){
      longitud=1;
      }
    if(n1==0){
      longitud1=1;
      }
      
    while(n>0){
      int nCalculada=(int)(n%10);
      volteadoPar=(volteadoPar*10)+nCalculada;
      volteadoImpar=(volteadoImpar*10)+nCalculada;
      n/=10;
      longitud++;
      }
    while(n1>0){
      int nCalculada1=(int)(n1%10);
      volteadoPar1=(volteadoPar1*10)+nCalculada1;
      volteadoImpar1=(volteadoImpar1*10)+nCalculada1;
      n1/=10;
      longitud1++;
      }
    System.out.print("El número formado por los digitos pares encontrados en este numero son: ");

     for (int i = 0; (i < longitud) && (i<longitud1); i++) {

      nPares = (int)(volteadoPar % 10);
      nPares1 = (int)(volteadoPar1 % 10);

      if ((nPares % 2) == 0) {
        System.out.print(nPares+ "");
      }
       if ((nPares1 % 2) == 0) {
        System.out.print(nPares1+ "");
      }

      volteadoPar /= 10;
      volteadoPar1 /= 10;
    }
    System.out.println();
    System.out.print("El número formado por los digitos impares encontrados en este numero son: ");
     for (int i = 0; (i < longitud) && (i<longitud1); i++) {

      nImpares = (int)(volteadoImpar % 10);
      nImpares1 = (int)(volteadoImpar1 % 10);
    
     if ((nImpares % 2) != 0) {
        System.out.print(nImpares+ "");
      }
       if ((nImpares1 % 2) != 0) {
        System.out.print(nImpares1+ "");
      }

     

      volteadoImpar /= 10;
      volteadoImpar1 /= 10;
    }
    
 
  }
}

public class Act26 {
  public static void main(String[] args) {
   
    System.out.print("BUSCA DIGITOS\n");

    System.out.print("Porfavor introduzca un numero: ");
    int  n = Integer.parseInt(System.console().readLine());
    System.out.print("Y ahora el digito que desea localizar:");
    int  x = Integer.parseInt(System.console().readLine());
    int nVolteado=0;
    int nBuscado=0;
    int posicion=1;
    System.out.print("El digito se encuentra en la posicion: " );
    
    while(n>0) {
      nVolteado=(nVolteado*10)+(n%10);
      n/=10;
      }
    
    while (nVolteado>0){
      if ((nVolteado%10)==x){
            System.out.print(posicion+" ");

        }
      nVolteado/=10;
      posicion++;
   }
    


    }
    
}

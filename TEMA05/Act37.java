public class Act37 {

  public static void main(String[] args) {
    
    System.out.print("----------------LENGUAJE DE PALOTES----------------\n");

    System.out.print("Porfavor introduzca un numero entero: ");
    long n = Long.parseLong(System.console().readLine());
    long volteado=0;
    long nReal=n;
    while(n>0){
      volteado=(volteado*10)+(n%10);
      n/=10;
    }
    System.out.print("El "+nReal+" en decimal es el ");

    while(volteado>0){
      for(int i=0;i < volteado%10;i++){
        System.out.print("|");
        }
        if (volteado>10){
        System.out.print("-");
      }
        volteado/=10;
      }
    System.out.print(" en el sistema de palotes");

    
}
}

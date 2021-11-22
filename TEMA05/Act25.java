public class Act25 {
  public static void main(String[] args) {
   
    System.out.print("VUELTA DE NUMEROS\n");

    System.out.print("Porfavor introduzca un numero\n ");
    int  n = Integer.parseInt(System.console().readLine());
    
   
    System.out.print("Su numero volteado seria: ");

    while (n>0){
      
      System.out.print(""+(n%10));
      n/=10;
   }
    


    }
    
}

public class Act28 {
  public static void main(String[] args) {
   
    System.out.print("CALCULO FACTORIAL\n");

    System.out.print("Porfavor introduzca un numero: ");
    int  n = Integer.parseInt(System.console().readLine());
    
    int multiplo=1;
    int total=1;

    
    
    for(int i=n; i>0; i--){
      total*=multiplo;
      multiplo++;
      }
    
    System.out.print( n+" != "+ total );


    }
    
}

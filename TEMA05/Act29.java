public class Act29 {
  public static void main(String[] args) {
   
    System.out.print("CALCULO \n");

    System.out.print("Porfavor introduzca un numero: ");
    int  n = Integer.parseInt(System.console().readLine());
    System.out.print("Porfavor introduzca un numero por el que no quieres que se divida: ");
    int  x = Integer.parseInt(System.console().readLine());
    
    int multiplo=1;
    int total=1;

    
    
    for(int i=1; i<n; i++){
      if ((i%x)!=0){
        System.out.print( i+" ");
        
        }
    
      }
    


    }
    
}

public class Act16 {
  public static void main(String[] args) {
   
   
    System.out.print("Porfavor introduzca un numero: ");
    int  numero = Integer.parseInt(System.console().readLine());
    int i=0;
    
    if ((numero==1)||(numero==2)){
    System.out.print("Este número es primo");      
    } else {
        for (i=2;((i<numero)&&(numero%i !=0));i++){}
          if(i==numero){
          System.out.print("Este número es primo");
        }else{
          System.out.print("Este número no es primo");
          }      
        
      }
     
  }
}

public class Act12 {
  public static void main(String[] args) {
   
   
    System.out.print("Porfavor introduzca un numero entero: ");
    int  cantidadNumeros = Integer.parseInt(System.console().readLine());
    
    int n1=0;
    int n2=1;
    if (cantidadNumeros==1){
     System.out.printf(""+0);
     
    } else if (cantidadNumeros==2){
       System.out.printf("%1d,%1d",0,1);
    
    } else if(cantidadNumeros>2){
         System.out.printf("%1d,%1d",0,1);
        for(int n=1 ; (cantidadNumeros-2) >0 ; n=n1+n2)  {
          System.out.printf(","+n);
          cantidadNumeros--;
          n1=n2;
          n2=n;
      
    }
    }
   
  }
}


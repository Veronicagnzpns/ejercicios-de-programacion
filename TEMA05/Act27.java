public class Act27 {
  public static void main(String[] args) {
   
    System.out.print("MULTIPOS DE 3\n");

    System.out.print("Porfavor introduzca un numero: ");
    int  nIntro = Integer.parseInt(System.console().readLine());
    int n=0;
    int nMedio=0;
    int sumaN=0;
    int cantidadN=0;
    System.out.print("Los multiplos de 3 entre 1 y "+nIntro+" son:");

    while (n<nIntro-3){
      
      nMedio=n+3;
      System.out.print(" "+nMedio);
      n=nMedio;
      sumaN+=nMedio;
      cantidadN++;
    }
    System.out.print("\nEn total sale "+cantidadN+" numeros multiplos de 3\n");
    System.out.print("La suma de estos da un total de "+sumaN);



    }
    
}

public class Act05 {
  public static void main(String[] args) {
    System.out.println("500 números aleatorios entre 100 y 199 (sin decimales):\n");
    int numero=0;
    int maximo=0;
    int minimo=200;
    int sumaTotal=0;
    for (int i = 1; i <= 50; i++) {
      numero=((int)(Math.random()*100))+100;
      System.out.print(numero + "  ");
      if(numero>maximo){
        maximo=numero;
        }
      if(numero<minimo){
        minimo=numero;
        }
        sumaTotal+=numero;
    }

   
        System.out.println("\nNumero maximo aleatorio:"+maximo);
        System.out.println("Numero minimo aleatorio:"+minimo);
        System.out.println("Media de los numeros aleatorios:"+sumaTotal);
         System.out.println();


  }
}

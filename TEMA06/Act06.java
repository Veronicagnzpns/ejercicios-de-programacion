public class Act06 {
  public static void main(String[] args) {
    System.out.println("20 números aleatorios entre 0 y 10 (sin decimales):");
    int numeroSecreto=(int)(Math.random()*111);
    int n=0;
          System.out.println("CORRECTO ESTE ES EL NUMERO!!"+numeroSecreto);

    for (int i = 5; (i > 0) && (numeroSecreto!=n); i--) {
    System.out.println("Dime un número de 0 a 100:");
    n = Integer.parseInt(System.console().readLine());
    
    if ( !(numeroSecreto==n) ) {
        if (i>0){ 
          System.out.println("Lo siento,no es el número aleatorio, te quedan "+(i-1)+" intentos");
        } else { 
          System.out.println("Lo siento, no es el número aleatorio Y A AGOTADO EL Nº DE INTENTOS.");
        }
       } 
  
  
    }
      if( numeroSecreto == n ){
      System.out.println("CORRECTO ESTE ES EL NUMERO!!");
    }

    System.out.println();
  }
}

public class Act13 {
  public static void main(String[] args) {
    int positivos=0;
    int negativos=0;
    int n=0;
    for (int i = 0; (i<10) ; i++) {
      System.out.print("Dime un número : ");
      n = Integer.parseInt(System.console().readLine());
  
      if (n>=0) {
      positivos++;
       } 
      if (n<0){ 
      negativos++;
        } 
    }
          System.out.printf("En esta lista de 10 digitos ahi %4d nº positivos y %5d nº negativos",positivos,negativos);

  }
}

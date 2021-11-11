public class Act10 {
  public static void main(String[] args) {
    System.out.println("Por favor, vaya introduciendo números y pulsando INTRO.");
    System.out.println("Para terminar, introduzca un número negativo.");
    
    int numeroIntroducido = 0;
    int cuentaNumeros = 0;
    int suma = 0;
    int total=0;   
    while (numeroIntroducido >= 0) {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      cuentaNumeros++; 
      suma += numeroIntroducido; 
     
    }
    total=(suma - numeroIntroducido)/(cuentaNumeros - 1); 
    System.out.println("Has introducido " + (cuentaNumeros - 1) + " números positivos.");
    System.out.println("La media total de ellos es " + total);
  }
}

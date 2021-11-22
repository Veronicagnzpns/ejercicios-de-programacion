public class Act21 {
  public static void main(String[] args) {
    System.out.println("Por favor, vaya introduciendo números y pulsando INTRO.");
    System.out.println("Para terminar, introduzca un número negativo.");
    
    int numeroIntroducido = 0;
    int numeroMayorPar = 0;
    int cuentaNumerosImpar = 0;
    int sumaNumerosIntro= 0;
    int sumaImpares = 0;
    int totalImpares=0; 
    int numeroAnterior=0;
    int cuentaNumerosPar=0;
   
    while (numeroIntroducido >=0) {
       if(numeroIntroducido<0){
      break;
      }
      
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if ((numeroIntroducido>numeroAnterior) && (numeroIntroducido%2 == 0)){
      numeroMayorPar=numeroIntroducido;
      }
      
      if(numeroIntroducido%2 == 0){
        cuentaNumerosPar++;
      }else { 
        sumaImpares +=numeroIntroducido;
        cuentaNumerosImpar++;
      }
      numeroAnterior=numeroIntroducido;
      sumaNumerosIntro++;
    }
  
    totalImpares = sumaImpares/cuentaNumerosImpar;
    
    System.out.println("Has introducido " + (sumaNumerosIntro) + " números.");

    System.out.println("El numero mayor de los pares es " + (numeroMayorPar));
    
    System.out.println("Has introducido " + (cuentaNumerosImpar) + " números impares.");
    
    System.out.println("suma de impares " + (sumaImpares) + " números impares.");

    System.out.println("La media total de ellos es " + totalImpares);
  }
}
